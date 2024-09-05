package com.cgi.springCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.springCoreDemo.service.Person;
import com.cgi.springCoreDemo.service.Student;

public class P06_CtorAndSetterInjectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("personAndStudentBean.xml");
		
		Person person = (Person)ctx.getBean("personBean");
		System.out.println(person);
		
		Student student = (Student)ctx.getBean("studentBean");
		System.out.println(student);
		
		((ConfigurableApplicationContext)ctx).close();
	}

}
