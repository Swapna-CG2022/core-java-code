package com.cg.threadclsexample;

public class ThreadGroupExample  {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup groupA = new ThreadGroup("GroupA");
		
		new Task(groupA, "A1").start();
		new Task(groupA, "A2").start();
		new Task(groupA, "A3").start();
		new Task(groupA, "A4").start();
		Thread.sleep(10000);
		//System.out.println(groupA.activeCount());
		//System.out.println(groupA.activeGroupCount());
		groupA.interrupt();
	}

}
