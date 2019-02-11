package OOPConceptsPart1;

public class LocalVsGlobalVariable {
	
	//name and age are global or Class variable because declared just after the class.
	String name = "Tom"; //global variable
	int age = 25;// global variabe.

	public static void main(String[] args) {
		int i = 10; // local variable for main method.
		System.out.println(i);
		// To access global variable you need to create the objects
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
public void sum() {
	int i = 15; // local variable for sum method
	int j = 20; //local variable
	int  age = 25; // local variable
}
}
