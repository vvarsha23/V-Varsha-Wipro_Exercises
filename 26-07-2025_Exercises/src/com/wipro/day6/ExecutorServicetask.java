package com.wipro.day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServicetask {
	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(5);
		for(int i=0;i<5;i++) {
			int taskId = i;
			ex.submit((Runnable) ()->{
				for(int j=0;j<10;j++) {
					System.out.println("Task"+taskId+"-Number:"+j);
				}
				
			});
		}
		
	}

}
