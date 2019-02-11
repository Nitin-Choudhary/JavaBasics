package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) {// throws ArithmeticException {// jVm catch this exception.
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("ABC");

	}
	
	public void sum() {//throws ArithmeticException {// exception thrown  by sum will be catch by main method
		try {
		div();
		}catch(Throwable e) {}
	}
	public void div() throws ArithmeticException{
		int i = 9/0; // this is throwing arithmeticexception but who will catch it. sum method will catch it
	}

}

//throws keyword is just to throw exception from one method to another method and finally to the 
// to the main method and in main method JVM will catch it and terminate the program.
//to handle termination
//Throwable is a super class for all error and exception in java language.
//What is the super class for error and exception? Ans;- Throwable.
