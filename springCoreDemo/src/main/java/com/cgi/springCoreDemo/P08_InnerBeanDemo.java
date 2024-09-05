package com.cgi.springCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.springCoreDemo.service.Employee;

public class P08_InnerBeanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("employeeAndAddress.xml");
		
		Employee emp = (Employee)ctx.getBean("employeeBean");
		System.out.println(emp);
		
		((ConfigurableApplicationContext)ctx).close();
		

	}

}
