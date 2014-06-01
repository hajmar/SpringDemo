package org.hnm736.javabrains;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware {
	private Point pointA;
	private Point pointB;
	private ApplicationContext context;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public void draw()	{
		System.out.println("Triangle draw");
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		System.out.println("setApplicationContext execute");
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("bean name is :" + beanName);
	}
}

