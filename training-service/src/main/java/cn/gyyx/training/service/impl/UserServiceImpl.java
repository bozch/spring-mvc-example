/**
 * -------------------------------------------------------------------------
 * @版权所有：北京光宇在线科技有限责任公司
 * @项目名称：
 * @作者：bozhencheng
 * @联系方式：bozhencheng@gyyx.cn
 * @创建时间：2016年7月25日 
 * @版本号：
 * @本类主要用途描述： 问道training
 *-------------------------------------------------------------------------
 */
package cn.gyyx.training.service.impl;

import org.springframework.stereotype.Service;

import cn.gyyx.training.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @author bozhencheng
 * @date 2016年7月25日
 */
@Service
public class UserServiceImpl implements UserService {

	/* (non-Javadoc)
	 * @see cn.gyyx.training.service.UserService#getHelloWorld()
	 */
	public String getHelloWorld() {
		return "Hello world";
	}
}
