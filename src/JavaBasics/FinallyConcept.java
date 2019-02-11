package JavaBasics;

import javax.management.RuntimeErrorException;

public class FinallyConcept {
	//finally is a block
	public static void main(String[] args) {
		//test1();
		//test2();
		division();
	}
	public static void test1() {
		try{
			System.out.println("Inside test method");
			throw new RuntimeException("test");
			}catch(Exception e) {
				System.out.println("inside catch block");
			}
		finally 
		{
			System.out.println("Inside finally block");
		}
	}
	//
	public static void test2() {
		try {
			System.out.println("Inside test 2 method");
		}
		finally
		{
			System.out.println("finally code in test2 method");
		}
	}
	
	//
	public static void division() {
		int i =10;
		try {
			System.out.println("inside try block");
			int k = i/0;
		}catch(ArithmeticException e) {
			System.out.println("Inside catch block");
			System.out.println("division by zero error");
		}
		finally
		{
			System.out.println("execute this code ever after every exception");
		}
	}
}
