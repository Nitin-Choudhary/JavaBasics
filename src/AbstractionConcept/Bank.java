package AbstractionConcept;

public abstract class Bank {//one abstract method is compulsory inside abstract class.
	int amt =100;
	final int rate = 10;
	static int loanrate=5;
	public abstract void loan(); //abstract method -- no method body
	
	public void credit() {
		System.out.println("Bank -- Credit");
	}

	public void debit() {
		System.out.println("Bank -- Debit");
	}
}

//abstract class can have abs method and non abstarct method.
//cannot create the object of Abstract Classs