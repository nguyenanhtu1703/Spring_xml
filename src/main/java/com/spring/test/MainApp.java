package com.spring.test;

import org.springframework.context.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.config.*;

public class MainApp {
	   public static void main(String[] args) {
		      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		      obj.getMessage();
		   }
}
