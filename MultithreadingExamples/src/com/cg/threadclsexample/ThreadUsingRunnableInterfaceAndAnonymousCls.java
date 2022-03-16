package com.cg.threadclsexample;

public class ThreadUsingRunnableInterfaceAndAnonymousCls {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Run method of Runnable Interface using anonymous class");
				
			}
		};
		
		Thread th2 = new Thread(runnable);
		th2.start();

	}

}
