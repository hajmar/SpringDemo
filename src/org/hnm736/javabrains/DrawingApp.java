package org.hnm736.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		// additional , Event Notification , AOP
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		//Triangle triangle = (Triangle)applicationContext.getBean("triangle");
		//Triangle triangle2 = (Triangle)applicationContext.getBean("triangle1");
		
		Square square = (Square)applicationContext.getBean("square");
		
		square.draw();
		
				
		//triangle2.draw();
		 		
		
	}

}
