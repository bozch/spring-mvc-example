/**
 * -------------------------------------------------------------------------
 * @版权所有：北京光宇在线科技有限责任公司
 * @项目名称：
 * @作者：GYYX-DEV
 * @联系方式：GYYX-DEV@gyyx.cn
 * @创建时间：2016年9月23日
 * @版本号：1.0.0
 * @本类主要用途描述：  光宇统一SDK
 *-------------------------------------------------------------------------
 */
package cn.gyyx.training.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import cn.gyyx.mobilestage.beans.StartLogInfo;
import cn.gyyx.mobilestage.dao.StartLogInfoMapper;
import cn.gyyx.training.beans.AccountBindLog;

/**
 * @ClassName: AccountBindLogMapperIntegerTest
 * @description 
 * @author bozhencheng
 * @date 2016年9月23日
 */
@ActiveProfiles(profiles="development")
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class AccountBindLogMapperIntegerTestNgTest extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private AccountBindLogMapper accountBindLogMapper;
	
	@Test
	public void test(){
		AccountBindLog selectByPrimaryKey = accountBindLogMapper.selectByPrimaryKey(1);
		System.out.println("");
	}

}
