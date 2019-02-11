package JavaBasics;

public class ConstructorWithThisKeyword {
	//class variable
	String name;
	int age;
	public ConstructorWithThisKeyword(String name, int age) {
		this.name =  name; //this keyword is used to initialize the class variable in the constructor.
						   // so in this ex. name = Tom and age =30 for class variable i.e on line 5 and 6 
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",30);

	}

}
