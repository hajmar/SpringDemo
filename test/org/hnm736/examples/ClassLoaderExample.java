package org.hnm736.examples;

public class ClassLoaderExample {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Class loading by reflection");
		ClassLoadingReflection clr = new ClassLoadingReflection();
		String shortClassName = clr.getClass().getSimpleName();
		String longClassName = clr.getClass().getName();
		System.out.println(shortClassName);
		final Class<?> cls = Class.forName(longClassName);
		//ClassLoadingReflection a = (ClassLoadingReflection) cls.newInstance();
		System.out.println("PART 2");
		Class<?> clr2 = ClassLoader.getSystemClassLoader().loadClass(longClassName);
		
		ClassLoadingReflection firstObj = (ClassLoadingReflection)cls.newInstance();
		firstObj.test();
		
		ClassLoadingReflection second = (ClassLoadingReflection)clr2.newInstance();
		second.test();
		
		if  ( second != firstObj )	{
			System.out.println("NOT equal");
		}
		
	}
}

class ClassLoadingReflection {
	static {
		System.out.println("LOADING CLASS");
	}

	public void test() {
		System.out.println("TEst");
	}
}