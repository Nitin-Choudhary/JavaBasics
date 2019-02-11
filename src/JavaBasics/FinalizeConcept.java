package JavaBasics;

public class FinalizeConcept {

	public void finalize(){// used to clean up processing of object.
		System.out.println("Inside finalized method");
	}
	//finalize is a method
	public static void main(String[] args) {
		
		FinalizeConcept f1 =  new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null; // it means you removing the reference to FinalizeConcept() object.
		f2=  null;
		
		System.gc(); // method to manually collect the garbage collection.
		

	}

}
