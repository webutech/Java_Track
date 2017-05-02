package com.yash.executors.running;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.yash.common.LoopTaskA;
public class UsingFixedThreadPool {

	public static void main(String[] args) {
		System.out.println("------------UsingFixedThreadPool. main starts --------------");
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		
		executorService.shutdown();
		System.out.println("------------UsingFixedThreadPool. main ends ----------------");

	}

}
