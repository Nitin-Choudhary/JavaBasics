package OOPConceptsPart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.sum();
		obj.sum(10);
		obj.sum(11, 12);

	}
	//can we overload main method - Yes we can overload
	public static void main(int p) {
		
	}
	public static void main(int p, int k) {
		
	}
	// you can not create method inside a method
	//duplicate method i.e. same method name with same number of argument not allowed and if same datatype
	//Method overloading :-- when method name is same with different arguments or input parameters with different datatypes within the same class
	public void sum() { //0 input parameter
		System.out.println("Sum method -- zero parameters");
	}
	public void sum(int i) {// 1 input parameter
		System.out.println("Sum Method -- 1 input parameter");
	}
	public void sum(double i) {// 1 input parameter
		System.out.println("Sum Method -- 1 input parameter with different datatype");
	}
	public void sum(int k, int l) {// 2 input parameter
		System.out.println("Sum Method -- 2 input parameter");
	}
}
