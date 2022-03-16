package com.cg.threadclsexample;

public class ThreadJoinMain {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadJoinExample());
		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Current THread = " + Thread.currentThread().getName()+ " Thread is Running");
	}

}
