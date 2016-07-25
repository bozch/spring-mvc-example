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
package cn.gyyx.training.action;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @ClassName: UserControllerTest
 * @author bozhencheng
 * @date 2016年7月25日
 */
@WebAppConfiguration
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/spring-servlet.xml"})
public class UserControllerTest  extends AbstractTestNGSpringContextTests {

	@Autowired
	protected WebApplicationContext applicationContext;
	/**
	 * 模拟测试
	 */
	private MockMvc mockMvc;
	/**
	  * @Title: init
	  * @Description: 初始化参数 
	  * @param 
	  * @return void 
	  * @throws
	  */
	@BeforeMethod
	public void init() {
		this.mockMvc = webAppContextSetup(this.applicationContext).build();
	}
	
	@Test(description="请求hello world时，返回状态为200，并且包含Hello world字符串。")
	public void WhenTriggerThenReturn200HelloWorld() throws Exception{
		this.mockMvc.perform(get("/helloworld"))
			.andDo(print())
			.andExpect(status().is(200)) // 期望200
			.andExpect(content().string("Hello world")); // 返回Hello world
	}
}
