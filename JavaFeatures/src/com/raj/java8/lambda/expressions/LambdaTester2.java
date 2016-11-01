package com.raj.java8.lambda.expressions;
public class LambdaTester2 {

	final static String SALUTATION = "Hello! ";

	public static void main(String args[]){
		GreetingService greetService1 = message -> 
		System.out.println(SALUTATION + message);
		greetService1.sayMessage("Raj");
	}

	interface GreetingService {
		void sayMessage(String message);
	}
}