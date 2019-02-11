package OOPConceptsPart1;

public class Car {
	
	//Class Vars:
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		
		// new Car();:- This is the object of car class 
		// a:- is reference variable which is referring to new car object.
		//Java create copy of each object belwo it will create 3 objecs.
			
		Car a = new Car(); 
		Car b = new Car();
		Car c = new Car();
	// we Initialize two reference variable mod and wheel with reference to "a"; 	
		a.mod = 2019;
		a.wheel = 4;
		
		b.mod = 2018;
		b.wheel = 4;
		
		c.mod = 2015;
		c.wheel = 4;
		
		System.out.println("Before Assigning the references:");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After shifting the references:");
		a=b;
		b=c;
		c=a;
		a.mod = 10;
		System.out.println(a.mod); //10
		c.mod =20;
		System.out.println(a.mod); //20
		System.out.println(c.mod); //20
		
	}

}