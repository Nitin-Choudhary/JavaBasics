package OOPConceptsPart1;

public class StaticsAndNonStaticConcept {
	//global variable :- the sope of global variable will be available across all the function with some condition.
	String name = "Tom"; //non static global variable
	static int age = 25; //static global variable

	public static void main(String[] args) {
		// How to call static method ?
		//1. Direct calling
		sum();
		//2. calling by class name
		StaticsAndNonStaticConcept.sum();
		
		//How to call variable?
		//1.directly 
		System.out.println(age);
		//2.calling my class name
		System.out.println(StaticsAndNonStaticConcept.age);
		
		//how to call non static methods and vars?
		StaticsAndNonStaticConcept obj = new StaticsAndNonStaticConcept();
		obj.sendmail();
		System.out.println(obj.name);
		//can i use static method by using object reference? Yes
	   //obj.sum();//warning will be given:-- Not a good practice

	}

	public void sendmail() {
		System.out.println("send mail method");
	}
	
	public static void sum() {
		System.out.println("sum method");
	}
}
