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

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.gyyx.training.beans.AccountBindLog;
import cn.gyyx.training.bll.UserBll;
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

	
	@Autowired
	UserBll userBll;
	
	/**
	 * hello world
	 * @return
	 */
	@RequestMapping("/helloworld")
	public String helloworld(){
		LOGGER.info("hello world.");
		AccountBindLog logs = userBll.getLogs();
		LOGGER.info(logs.getAccount());
		return userService.getHelloWorld();
	}
	
	/**
	 * 返回json数据
	 * @return
	 */
	@RequestMapping("/getJson")
	public ResponseEntity<Object> getJsonData(){
		Map<String, String> results = new HashMap<>();
		results.put("gyyx", "win");
		results.put("yykf", "win");
		return new ResponseEntity<>(results,HttpStatus.OK);
	}
}
