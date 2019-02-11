package ExceptionHandling;

public class ExceptionHandlingConcept {

	public static void main(String[] args) {
		
	//1. try-catch block;
	 try {
		int i = 9/0;// this code will throw exception
		
	 }catch(ArithmeticException e) {
		 System.out.println("ABC");
		 e.printStackTrace();
		 System.out.println(e.getMessage());//give actual error
	 }	

	}
	
	

}
