package org.maro.javabrains;

public class Test {
	public static void main(String[] args) {
		Beagle b1 = new Beagle();
		
		Dog d1 = new Dog();
		Dog d2 = b1;
		
		Beagle b2 = (Beagle)d1;
	}
}

class Dog	{}
class Beagle extends Dog{
}
