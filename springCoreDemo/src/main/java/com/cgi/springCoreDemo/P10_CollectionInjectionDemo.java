package com.cgi.springCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.springCoreDemo.service.MyCollectionBean;

public class P10_CollectionInjectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("collectionsInjection.xml");
		
		MyCollectionBean listBean =
				(MyCollectionBean)ctx.getBean("myListBean");
		listBean.displayCollections();
		
		MyCollectionBean setBean =
				(MyCollectionBean)ctx.getBean("mySetBean");
		setBean.displayCollections();
		
		MyCollectionBean mapBean =
				(MyCollectionBean)ctx.getBean("myMapBean");
		mapBean.displayCollections();
		
		((ConfigurableApplicationContext)ctx).close();

	}

}
