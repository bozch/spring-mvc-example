/**
 * -------------------------------------------------------------------------
 * @版权所有：北京光宇在线科技有限责任公司
 * @项目名称：
 * @作者：bozhencheng
 * @联系方式：bozhencheng@gyyx.cn
 * @创建时间：2016年8月8日 
 * @版本号：
 * @本类主要用途描述： 问道十年缤纷活动
 *-------------------------------------------------------------------------
 */
package cn.gyyx.training.validation.beans;

import static org.testng.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @ClassName: UserEntityTest 对实体进行校验配置验证
 * @author bozhencheng
 * @date 2016年8月8日
 */
public class UserEntityTest {
	
	public static Validator validator;
	
	
	@BeforeClass
	public void setupValidator(){
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		validator = validatorFactory.getValidator();
	}
	
	@Test
	public void whenUserIdLessThenOne(){
		
		UserEntity entity = new UserEntity();
		entity.setUserId(-1);
		entity.setGender("1");
		entity.setUserName("validtor");
		entity.setPassword("123456");
		
		Set<ConstraintViolation<UserEntity>> validate = validator.validate(entity);
		assertEquals(validate.size(), 1);
		assertEquals(validate.iterator().next().getMessage(), "user ID must start with 1.");
	}
	
	@Test
	public void whenUserNameIsNull(){
		UserEntity entity = new UserEntity();
		entity.setUserId(1);
		entity.setGender("1");
		entity.setPassword("123456");
		
		Set<ConstraintViolation<UserEntity>> validate = validator.validate(entity);
		assertEquals(validate.size(), 1);
		assertEquals(validate.iterator().next().getMessage(), "UserName can not be null.");
	}
}
