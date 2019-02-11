package JavaBasics;

import java.util.ArrayList;

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
		// No generic vs generic
		//Restrict array list of just insert integer
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		//Restrict array list of just String integer
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
	
	}

}
