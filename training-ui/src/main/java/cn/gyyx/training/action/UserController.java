/**
 * -------------------------------------------------------------------------
 * @版权所有：北京光宇在线科技有限责任公司
 * @项目名称：
 * @作者：bozhencheng
 * @联系方式：bozhencheng@gyyx.cn
 * @创建时间：2016年7月21日 
 * @版本号：
 * @本类主要用途描述： 问道十年缤纷活动
 *-------------------------------------------------------------------------
 */
package cn.gyyx.training.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.gyyx.training.service.UserService;

/**
 * @ClassName: UserController
 * @author bozhencheng
 * @date 2016年7月21日
 */
@RestController
public class UserController {

	/**
	 * 日志记录
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	/**
	 * 用户业务操作
	 */
	private UserService userService;
	
	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * @param userService the userService to set
	 */
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	/**
	 * hello world
	 * @return
	 */
	@RequestMapping("/helloworld")
	public String helloworld(){
		LOGGER.info("hello world.");
		return userService.getHelloWorld();
	}
}
