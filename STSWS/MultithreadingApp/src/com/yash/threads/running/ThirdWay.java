package com.yash.threads.running;

import java.util.concurrent.TimeUnit;

class ThirdTask implements Runnable{
	private static int count=0;
	private int id;
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("<id : "+id+" :Count Down : >"+i);
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}		
	}	
	public ThirdTask() {
		id=++count;
		new Thread(this).start();
	}	
}

public class ThirdWay {
	public static void main(String[] args) {
		System.out.println("---------main starts-----------");
		new ThirdTask();
		new ThirdTask();
		System.out.println("---------main ends-----------");
	}
}
