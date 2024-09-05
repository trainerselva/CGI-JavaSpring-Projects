package com.cgi.springCoreDemo.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class P03_AutowiringConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("autowireConstructor.xml");
		
		PersonWithCtor person =
				(PersonWithCtor)ctx.getBean("person");
		
		System.out.println(person);
		
		((ConfigurableApplicationContext)ctx).close();

	}

}
