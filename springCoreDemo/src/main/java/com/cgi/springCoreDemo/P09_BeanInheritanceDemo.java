package com.cgi.springCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.springCoreDemo.service.Person;

public class P09_BeanInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("beanInheritance.xml");
		
		Person child = 
				(Person)ctx.getBean("childPersonBean");
		
		System.out.println(child);
		
		((ConfigurableApplicationContext)ctx).close();
		

	}

}
