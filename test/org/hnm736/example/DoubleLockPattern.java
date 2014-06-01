package org.hnm736.example;

public class DoubleLockPattern extends Thread{
	public DoubleLockPattern(String name) {
		this.setName(name);
	}
	
	@Override
	public void run(){
		synchronized (Single.getSingle()) {
			System.out.println("GOING TO SLEEP for 4 sec");
			try {
				sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("AFTER SLEEP");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread th = new DoubleLockPattern("TEST TASK");
		th.start();
		Thread.sleep(1000);
		System.out.println("AFTER START GOING TO change");
		
		synchronized (Single.getSingle())	{
			System.out.println("FINISH");
		}
	}
	
}


final class Single	{
	private Single single;

	public Single getSingle() {
		if (null == single){
				synchronized (this) {
					if ( null == single)	{
						single = new Single();
					}
				}
		}
		
		return single;
	}

	private Single()	{};
	
}