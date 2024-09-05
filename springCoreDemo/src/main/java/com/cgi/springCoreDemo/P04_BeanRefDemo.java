package com.cgi.springCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.springCoreDemo.service.TextEditor;

public class P04_BeanRefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("beanRef.xml");
		TextEditor textEditor =
				(TextEditor) ctx.getBean("textEditor");
		textEditor.spellCheck();
		
		((ConfigurableApplicationContext)ctx).close();
	}

}
