package org.maro.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class ExampleVehicle {
	public static void main(String[] args) throws InterruptedException {
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("wed.xml"));
		ApplicationContext factory = new ClassPathXmlApplicationContext("wed.xml");
		
		Vehicle vehicle = (Vehicle)factory.getBean("v1");
		//Vehicle cloneVehicle = (Vehicle)factory.getBean("v1");
		vehicle.display();
		Vehicle vehicle2 = (Vehicle)factory.getBean("v2");
		vehicle2.display();
		
		Wheel wheel = (Wheel)factory.getBean("wheel");
		wheel.display();
		
		Size size = (Size)factory.getBean("size");
		
		Size size2 = (Size)factory.getBean("size");
		
		if (size == size2) 	{
			System.out.println("These are the same objects of SIZE");
		}
		Thread.sleep(1000);
		
		((AbstractApplicationContext) factory).registerShutdownHook();
		
	}
}
