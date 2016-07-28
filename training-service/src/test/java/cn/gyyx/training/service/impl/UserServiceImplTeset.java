/**
 * -------------------------------------------------------------------------
 * @版权所有：北京光宇在线科技有限责任公司
 * @项目名称：
 * @作者：bozhencheng
 * @联系方式：bozhencheng@gyyx.cn
 * @创建时间：2016年7月25日 
 * @版本号：
 * @本类主要用途描述： 问道十年缤纷活动
 *-------------------------------------------------------------------------
 */
package cn.gyyx.training.service.impl;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * @ClassName: UserServiceImplTeset
 * @author bozhencheng
 * @date 2016年7月25日
 */
public class UserServiceImplTeset {
	
	private UserServiceImpl userService;
	
	@Test(description="helloworld方法返回字符串\"Hello world\"")
	public void whenGetHelloWorldThenReturnHelloworld(){
		userService = new UserServiceImpl();
		assertEquals("Hello world",userService.getHelloWorld());
	}
}
