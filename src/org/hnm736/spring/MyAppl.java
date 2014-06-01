package org.hnm736.spring;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppl {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Hello hello = (Hello)context.getBean("hello");
		
		System.out.println(hello.getMessage());
		
		Date date;
		 date = new Date();
		 
		 
		int p = 5;
		   double dd = 5.0;
		   {
			   
		   }
		Scanner scanner;
		Matcher matcher;
		
		
	}
}
