package com.cgi.springCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.springCoreDemo.service.GreetingService;

public class P03_SetterInjectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans3.xml");
		GreetingService greeter = (GreetingService)ctx.getBean("greetingService");
		greeter.greet();
		
		((ConfigurableApplicationContext)ctx).close();
	}

}
