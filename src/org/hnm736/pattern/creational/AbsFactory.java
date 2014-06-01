package org.hnm736.pattern.creational;

public class AbsFactory {
	public static void main(String [] args)	{
		
	}
}

interface Button	{
	public void paint();
}

class WindowsButton implements Button	{
	
	@Override
	public void paint() {
		System.out.println("Windows button paint");
	}
}

class MacButton implements Button {
	@Override
	public void paint() {
		System.out.println("Mac button paint");
	}
}


abstract interface ButtonFactory {
	public Button createButton();
}

class WindowsFactory implements ButtonFactory	{
	@Override
	public Button createButton() {
		System.out.println("Create Win button");
		return new WindowsButton();
	}
}

class MacFactory implements ButtonFactory	{
	@Override
	public Button createButton() {
		System.out.println("Create Mac factory");
		return new MacButton();
	}
}

class GUIFactory	{
	private GUIFactory() {
		
	}
	
	public static Button createButton()	{
		String os = null;
		
		os = "windows";
		
		if ("windows".equalsIgnoreCase(os	))	{
			return new WindowsFactory().createButton();
		} else if ("mac".equalsIgnoreCase(os))	{
			return new MacFactory().createButton();
		}
		return null;
	}
}