package org.hnm736.interviewPrograms;

public class DeadLockExample {
	String synFirst = "FIRST";
	String synSecond = "SECOND";
	
	Thread th1 = new Thread("First thread")	{
		public void run() {
			while(true)	{
				synchronized (synFirst) {
					synchronized (synSecond) {
						System.out.println(synFirst + synSecond);
					}
				}
			}
		};
	};
	
	Thread th2 = new Thread("Second thread")	{
		public void run() {
			while(true)	{
				synchronized (synSecond) {
					synchronized (synFirst) {
						System.out.println(synSecond + synFirst);
					}
				}
			}
			
		};
	};
	
	
	public static void main(String [] args){
		DeadLockExample dle = new DeadLockExample();
		dle.th1.start();
		dle.th2.start();
		System.out.println("final");
	}
}
