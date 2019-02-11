package OOPConceptsPart2;

public class TestCar {
	
	//static polymorphism -- compile-time polymorphism. why? because at time of compilation java will
	//decide which method to call.
	//Polymorphism means one to many i.e method overriding.
	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refule();
		b.theftSaftey();
		b.engine();
		
		System.out.println("**************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refule();
		//c.theftsaftey() // you cannot call theftsaftey method of BMW call as parent cannot inherit from child class.
		
		System.out.println("*******************");
		//This is also called Top Casting
		Car c1 = new BMW();//child class object can be referred by parent class reference variable. 
						   //This is called as dynamic polymohphism - run-time ploymorphism.
		c1.start();//overridden method will be call i.e. inside BMW.
		c1.stop();
		c1.refule();
		//c1.theftsafety //you can refer child class object but cannot refer its property.
		// only and only overridden method plus parent class method can be called using dynamic polymorphism.
		
		//Down casting
		//BMW b1 = (BMW)new Car();// child class reference variable cannot refer to parent class object.
								// to cast the car class object into BMW object you need to put (BMW) in front of Car object.
		//*** Down casting is possible but it will give you ClassCastException

	}

}
