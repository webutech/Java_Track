package com.yash.executors.running;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.yash.common.LoopTaskA;
public class UsingCachedThreadPool {

	public static void main(String[] args) {
		System.out.println("------------UsingCachedThreadPool. main starts --------------");
		ExecutorService executorService=Executors.newCachedThreadPool();
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());		
		executorService.shutdown();
		System.out.println("------------UsingCachedThreadPool. main ends ----------------");
	}
}
