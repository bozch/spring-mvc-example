/**
 * -------------------------------------------------------------------------
 * @版权所有：北京光宇在线科技有限责任公司
 * @项目名称：
 * @作者：bozhencheng
 * @联系方式：bozhencheng@gyyx.cn
 * @创建时间：2016年7月27日 
 * @版本号：
 * @本类主要用途描述： 问道十年缤纷活动
 *-------------------------------------------------------------------------
 */
package cn.gyyx.training.bll.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gyyx.training.beans.AccountBindLog;
import cn.gyyx.training.bll.UserBll;
import cn.gyyx.training.dao.AccountBindLogMapper;

/**
 * @ClassName: UserBllImpl
 * @author bozhencheng
 * @date 2016年7月27日
 */
@Service
public class UserBllImpl implements UserBll {

	@Autowired
	AccountBindLogMapper accountbindMapper;
	
	/* (non-Javadoc)
	 * @see cn.gyyx.training.bll.UserBll#getLogs()
	 */
	@Override
	public AccountBindLog getLogs() {
		return accountbindMapper.selectByPrimaryKey(1);
	}
}
