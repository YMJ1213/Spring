package com.iteima.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.service.ICustomerService;

/*Spring得入门案例*/
public class Client {

	/*
	 * classPthxmlApplicationContentext:加载类路径下得配置文件 （用这个）
	 * FileSystemxmlApplicationContext:加载磁盘任意位置得配置文件
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取容器
		ApplicationContext aC = new ClassPathXmlApplicationContext("bean.xml");
		//根据bean得id获取对象
		ICustomerService cs = (ICustomerService) aC.getBean("customerService");
		ICustomerService cdao = (ICustomerService) aC.getBean("customerDao");
		
		System.out.println(cs);
		System.out.println(cdao);
		
	}

}
