package OOPConceptsPart2;
//if any class implements interface. it is compulsory to define all the method in the interface.
public class HSBCBank implements USBank, BrazilBank{ //we are achieving multiple inheritance
	//Is - a relation.
	//overriding from USBANK
	public void credit() {
	 System.out.println("HSBC--Credit");		
	}

	public void debit() {
	 System.out.println("HSBC--Debit");
		
	}

	public void transferMoney() {
		System.out.println("HSCB--trasfermoney");
		
	}
	//seperate method from HSBCclass
	public void educationLoan() {
		System.out.println("HSBC--educationLoan");
	}
	
	public void carLoan() {
		System.out.println("HSBC--CarLoan");
	}
	//Brazil bank method. Overriding from BrazilBank
	public void mutualFund() {
		System.out.println("HSbC--Mutual Fund");
		
	} 
}
