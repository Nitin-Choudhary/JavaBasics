// Function and method both are same thing.
//discuss only about non static method  below.
//There are 3 type of methods. 
// 1. no input no output 2. no input some output 3. some input some output

package OOPConceptsPart1;

public class FunctionsInJava {
	// one object will be created and "obj" is reference variable, referring to this object.
	//after creating the object , the copy of all non static methods will be given to this object.
	// imp:- Object cannot hold statics method only non static method.
	//imp:- it is compulsory to create object to call non static method.
	// Why main method is void? :- because it never returns the value.
	
	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava(); 
		obj.test();
		
		String s1 = obj.QA();
		System.out.println(s1);
		
		int div = obj.division(20, 10);
		System.out.println(div);
		

	}
		// void:- does not return any value
		public void test() { //no input no output
			System.out.println("test method");
	}
		// return type int
		public int pqr() { //no input, some output
			System.out.println("PQR method");
		int a=10;
		int	b=20;
		int	c=a+b;
		return c;
		}
		
		public String QA() { //no input, some output
			System.out.println("QA Method");
			String s = "Selenium";
			return s;
		}
		public int division(int x, int y) { //some input, some output; x and y input parameters.
			System.out.println("Division method");
			int d = x/y;
			return d;
		}
}
