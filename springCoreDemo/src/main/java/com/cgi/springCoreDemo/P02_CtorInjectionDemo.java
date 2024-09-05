package com.cgi.springCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.springCoreDemo.service.MessageService;

public class P02_CtorInjectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans2.xml");
		MessageService msgService = (MessageService)context.getBean("messageService");
		msgService.printMessage();
		((ConfigurableApplicationContext)context).close();
	}

}
