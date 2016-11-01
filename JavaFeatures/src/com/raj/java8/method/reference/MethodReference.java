package com.raj.java8.method.reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {
	public static void main(String args[]){
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		//pre-8 Java. Something like this:
		numbers.forEach(new Consumer<Integer>() {
		    public void accept(Integer value) {
		        System.out.println(value);
		    }
		});
		
		// Java 8 lambda expressions allow to achieve the same result in 
		// a less verbose and more readable way:
		numbers.forEach((Integer value) -> System.out.println(value));
		// inferred by the compiler and then omitted as it follows:
		numbers.forEach(value -> System.out.println(value));
		
		// More in details in Java 8 it is possible to reference both a static and an instance 
		// a method using the new :: operator as in:
		numbers.forEach(System.out::println);
	}
}