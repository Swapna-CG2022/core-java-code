package com.cg.threadclsexample;

public class ThreadUsingRunnableInterfaceLambda {

	public static void main(String[] args) {

		Runnable rti = () -> {
			System.out.println("run method using runnable and lambda");
		};

		new Thread(rti).start(); //an anonymous object for thread class is created to start the thread
	}

}
