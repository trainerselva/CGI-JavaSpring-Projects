package com.cgi.springCoreDemo.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class P02_AutowiringByType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("autowireByType.xml");
		
		Person person =
				(Person)ctx.getBean("person");
		
		System.out.println(person);
		
		((ConfigurableApplicationContext)ctx).close();

	}

}
