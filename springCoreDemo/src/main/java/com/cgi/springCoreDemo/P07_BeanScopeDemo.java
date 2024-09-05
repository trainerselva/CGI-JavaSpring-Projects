package com.cgi.springCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.springCoreDemo.service.Person;

public class P07_BeanScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("personBeanScope.xml");
		
		Person person1 = (Person)ctx.getBean("personBean");
		System.out.println(person1);
		
		
		Person person2 = (Person)ctx.getBean("personBean");
		System.out.println(person2);
		
		System.out.println("person1 == person2 ==> " + (person1 == person2));
		
		((ConfigurableApplicationContext)ctx).close();

	}

}
