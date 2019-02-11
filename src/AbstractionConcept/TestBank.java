package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		HDFCBank hb = new HDFCBank();
		hb.credit();
		hb.debit();
		hb.loan();
		
		Bank b = new HDFCBank();
		b.credit();
		b.debit();
		b.loan();
	}

}

//abstraction means hide implementation logic
//through abstract call we are not achieving 100% abstraction we are acheiving partial abstraction
