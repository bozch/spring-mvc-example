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

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
	@Test
	public void test(){
		
		Integer a = 1466057;
		ByteBuffer buffer = ByteBuffer.allocate(Integer.SIZE/Byte.SIZE).order(ByteOrder.LITTLE_ENDIAN);
		buffer.clear();
		buffer.putInt(a);
		byte[] array = buffer.array();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			System.out.println((byte)array[i]&0xff);
		}
		System.out.println("**************************");
		System.out.println((byte)((a >> 8)&0xff));
		System.out.println((byte)((a >> 16)&0xff));
		System.out.println((byte)((a >> 24)&0xff));
		System.out.println((byte)((a >> 32)&0xff ));
		try {
			print(array);
			MessageDigest messageDigest =  MessageDigest.getInstance("MD5");
			byte[] digest = messageDigest.digest(array);
			print(digest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void print(byte[] bytes) throws IOException{
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);
		DataInputStream stream = new DataInputStream(bufferedInputStream);
		
			int leng = stream.available();
			System.out.println("************"+leng+"**************");
			for(int i =0 ; i<leng;i++){
				System.out.println(stream.readUnsignedByte());
			}
			System.out.println("*************************");
	}
	
	
}
