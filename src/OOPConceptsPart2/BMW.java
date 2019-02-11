package OOPConceptsPart2;

public class BMW extends Car {//has-a-relationship	
	//when same method is present in parent class as well as in child class with same number of arguments, 
	//is called method overriding.
	public void start() {// this is overridden method
		System.out.println("BMW--start");
	}
	public void theftSaftey() {
		System.out.println("BWM--TheftSafety");
	}
}
