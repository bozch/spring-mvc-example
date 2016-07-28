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
package cn.gyyx.training.bll;

import cn.gyyx.training.beans.AccountBindLog;

/**
 * @ClassName: UserBll
 * @author bozhencheng
 * @date 2016年7月27日
 */
public interface UserBll {

	/**
	 * 获取日志
	 * @return
	 */
	public AccountBindLog getLogs();
	
}
