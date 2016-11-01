package com.raj.java8.lambda.expressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTester3 {
	public static void main(String [] a)  {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		System.out.print("Print all numbers: ");
		evaluate(list, (n) -> true);

		System.out.print("Print no numbers: ");
		evaluate(list, (n) -> false);

		System.out.print("Print even numbers: ");
		evaluate(list, (n) -> n%2 == 0 );

		System.out.print("Print odd numbers: ");
		evaluate(list, (n) -> n%2 == 1 );

		System.out.print("Print numbers greater than 5: ");
		evaluate(list, (n) -> n > 5 );
		
		//Old way:
		int sum = 0;
		for(Integer n : list) {
			int x = n * n;
			sum = sum + x;
		}
		System.out.println("Old way of Sum: "+sum);
		
		//New way:
		sum = list.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
		System.out.println("New way of Sum: "+sum);
	}

	public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
		for(Integer n: list)  {
			if(predicate.test(n)) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
	}
}
