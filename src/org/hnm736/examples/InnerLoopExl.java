package org.hnm736.examples;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class HelpThread implements Runnable	{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class InnerLoopExl {
	static String dataToScanner = "adfdsafasdfdsa";
	public static void main(String[] args) throws Exception {
		List<Integer> array = new ArrayList<>();
		array.add(0,59);
		int total = array.get(0);
		System.out.println(total);
		array.add(1,4);
		array.add(0,45);
		System.out.println(array.get(0));
		
	}
	

}

