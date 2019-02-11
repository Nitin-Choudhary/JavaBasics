package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		System.out.println(ar.size());
		
		ar.add(400);//3
		ar.add(500);//4
		System.out.println(ar.size());
		
		ar.add("Tom");//5
		ar.add(12.33);//6
		ar.add('M');//7
		System.out.println(ar.size());
		ar.remove(7);
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		
		//To print all the value of arraylist :- user for loop
		for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
		}
		//Restrict array list of just insert integer
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		//Restrict array list of just String integer
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		//Employee class object
		Employee e1 = new Employee("Nitin", 38, "QA");
		Employee e2 = new Employee("Sunil", 35, "Dev");
		Employee e3 = new Employee("Mayur", 39, "CA");
		
		//Create Arraylist to store class object of employee class.
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the value
		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) {
			Employee emp = (Employee) it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("************************");
		//********************************
		
		//addAll()
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("Selenium");
		ar5.add("QtP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("Java");
		ar6.add("JavaScript");
		
		ar5.addAll(ar6);// merge two arraylist together
		
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("*********************");
		//removeall()
		ar5.removeAll(ar6);
		
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("**************************");
		//retainALl :-- retain common value in two arraylist
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("Selenium");
		ar7.add("QtP");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("test");
		ar8.add("Java");
		ar8.add("JavaScript");
		
		ar7.retainAll(ar8);
		for(int i=0;i<ar7.size();i++) {
			System.out.println(ar8.get(i));
		}
		
	}

}
