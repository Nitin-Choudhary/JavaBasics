package JavaBasics;

public class IfElseOperator {

	public static void main(String[] args) {
	 int a =10;
	 int b =20;
	 if(b>a) {
		 System.out.println("b is greater than a");
	 }
	 else {
		  System.out.println("a is greater than b");
	 }

	 // comparison operators
	 //<, >, >=, <=, ==, !=
	 //write a logic to find out the highest number
	 int a1=500;
	 int b1=700;
	 int c1=300;
	 //nested if else
	 if(a1>b1 & a1>c1) {
		 System.out.println("a1 is highest");
	 }else if(b1 > c1){
		 System.out.println("b1 is Highest");
	 }else
	 {
		 System.out.println("C1 is the Highest");
	 }
	
		 
	
}
}
