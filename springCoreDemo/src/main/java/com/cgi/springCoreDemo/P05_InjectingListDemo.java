package com.cgi.springCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.springCoreDemo.service.MovieLibrary;

public class P05_InjectingListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("movieLibraryBean.xml");
		MovieLibrary library = (MovieLibrary)ctx.getBean("movieLibrary");
		library.displayMovies();
		
		((ConfigurableApplicationContext)ctx).close();
	}

}
