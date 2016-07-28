/**
 * -------------------------------------------------------------------------
 * @版权所有：北京光宇在线科技有限责任公司
 * @项目名称：
 * @作者：bozhencheng
 * @联系方式：bozhencheng@gyyx.cn
 * @创建时间：2016年7月28日 
 * @版本号：
 * @本类主要用途描述： 问道十年缤纷活动
 *-------------------------------------------------------------------------
 */
package cn.gyyx.training.bll.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.springframework.ui.context.ThemeSource;
import org.testng.annotations.Test;

import cn.gyyx.training.beans.AccountBindLog;

/**
 * @ClassName: UserBllImplTest
 * @author bozhencheng
 * @date 2016年7月28日
 */
public class UserBllImplTest {

	private UserBllImpl userBllImpl;
	
	@Test(description="测试部署文件")
	public void whenInvokeThisMethodThenReturnLog(){
		this.userBllImpl = mock(UserBllImpl.class);
		AccountBindLog accountBindLog = new AccountBindLog();
		accountBindLog.setAccount("123");
		when(this.userBllImpl.getLogs()).thenReturn(accountBindLog);
		assertThat("123".equals(this.userBllImpl.getLogs().getAccount()));
	}
	
}
