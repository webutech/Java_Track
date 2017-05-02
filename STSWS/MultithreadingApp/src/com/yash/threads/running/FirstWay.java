package com.yash.threads.running;

import java.util.concurrent.TimeUnit;

class FirstTask extends Thread{
	private static int count=0;
	private int id;
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("<id : "+id+" :Count Down : >"+i);
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}		
	}	
	public FirstTask() {
		id=++count;
		this.start();
	}	
}

public class FirstWay {
	public static void main(String[] args) {
		System.out.println("---------main starts-----------");
		new FirstTask();
		new FirstTask();
		System.out.println("---------main ends-----------");
	}
}
