package com.raj.java8.CompletableFuture;

import java.time.LocalDate;

public class TaskSupplier{
	static double getSomeArbitraryDouble(){
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 5;
	}
	static double getAnotherArbitraryDouble(){
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 10;
	}

	static double getValueForCompletableFuture4(){
		LocalDate localDate = LocalDate.now();
		int currDate = localDate.getDayOfMonth();
		if (currDate%2 == 0)
			return 100;
		else
			return 50;
	}

	static double throwRuntimeException(){
		throw new RuntimeException("Some RuntimeException was thrown");
	}

	static double cancelThisTask(){
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 50D;
	}
}
