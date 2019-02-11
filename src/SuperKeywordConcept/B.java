package SuperKeywordConcept;

public class B extends A{
	
	public B() {
		super(10); //super keyword is used to call parameterize constructor of parents class.
		System.out.println("child class const");
	}
	
	public B(int k) {
		super(10,20);
	
	}
	public static void main(String arg[]) {
		B obj = new B();
		B obj1 = new B(10);
		
	}
}	 
 