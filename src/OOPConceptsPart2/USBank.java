package OOPConceptsPart2;

public interface USBank { 
	
	int min_bal = 100;
	public void credit(); 
	
	public void debit();
	
	public void transferMoney();

	//In interface we just define method and not the method body
	//no method body--only method prototype
	//in interface, we can declare the variables, vars are by default static in nature
	//variable value cannot be changed. Its final/Constant in nature
	//no static method in interface.:- its parts of object so we can rite static in 
	// we can not create object of interface
	//no main method.
	//interface is abstract in nature.
}
