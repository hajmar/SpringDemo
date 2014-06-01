package org.maro.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
	public static void main(String[] args) {
		// Triangle triangle = new Triangle();
		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("spring2.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring2.xml");

		Triangle triangle = (Triangle) context.getBean("triangle-name");

		triangle.draw();

	}
}
