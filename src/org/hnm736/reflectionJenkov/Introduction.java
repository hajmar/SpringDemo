package org.hnm736.reflectionJenkov;

import java.lang.reflect.Method;

public class Introduction {
	public static void main(String [] args)	{
		Method[] methods = Temporary.class.getMethods();
		
		for ( Method mt : methods){
			System.out.println("Method : " + mt.getName());
		}
	}


	protected class Temporary	{
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		private int age;
		private int weight;
	}
}

