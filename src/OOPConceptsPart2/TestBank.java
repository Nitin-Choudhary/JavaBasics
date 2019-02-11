package OOPConceptsPart2;

public class TestBank {

	public static void main(String[] args) {
		System.out.println(USBank.min_bal);
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.carLoan();
		hs.educationLoan();
		hs.transferMoney();
		// dynamic polymorphism
		//child class object can be referred by parent interface reference var
		USBank b=new HSBCBank();
		b.credit();
		b.transferMoney();
		b.debit();
	}

}
