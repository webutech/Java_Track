package com.yash.common;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {

	private static int count=0;
	private int id;
	@Override
	public void run() {
		System.out.println("########## <Task : "+id+"> Starting ###############");
		for (int i = 0; i < 10; i++) {
			System.out.println("<Task : "+id+" :Count Down : >"+i);
			try {
				TimeUnit.MILLISECONDS.sleep((long)(Math.random()*1000));
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}	
		System.out.println("********** <Task : "+id+"> Done ************");
	}	
	public LoopTaskA() {
		id=++count;
		
	}	

}
