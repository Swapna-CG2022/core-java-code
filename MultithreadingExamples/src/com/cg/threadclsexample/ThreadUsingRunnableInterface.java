package com.cg.threadclsexample;

public class ThreadUsingRunnableInterface implements Runnable{

	@Override
	public void run() {
		System.out.println("Run method by implementing the runnable interface.......");
		
	}

	public static void main(String[] args) {
		ThreadUsingRunnableInterface tri = new ThreadUsingRunnableInterface();
		Thread th = new Thread(tri);
		th.start();
	}
}
