package com.cgi.springCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.springCoreDemo.service.GreetingService;

/**
 * Hello world!
 *
 */
public class P01_App 
{
    public static void main( String[] args )
    {
        // Load the Spring XML configuration file
    	ApplicationContext context =
    			new ClassPathXmlApplicationContext("beans.xml");
    	
    	// Retrieve the bean from the Spring container
    	GreetingService greetingService =
    			(GreetingService) context.getBean("greetingService");
    	
    	// Call the greet method
    	greetingService.greet();
    	
    	((ConfigurableApplicationContext)context).close();
    }
}
