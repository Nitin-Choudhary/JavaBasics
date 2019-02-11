package TestPackage;

public class ParentClass { //public final class ParentClass
	//to prevent inheritance we used final keyword. This will prevent extending to child classs
	//to prevent method overriding:- you should declare final keyword for the method.
	public void start() { //public final void start() 
		System.out.println("Parent -- start method");
	}
}
