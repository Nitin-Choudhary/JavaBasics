package JavaBasics;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");//0
		h.put("B", "Hello");//1
		h.put("C", "World");//2
		
		System.out.println(h.size());
		
		h.put(1, 100);//3
		h.put(2, "Tom");//4
		
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("A"));
		
		//To restrict hashtable to use just one datatype
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(1, 100);
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer,String>();
		h2.put(1, "Tommy");
	}

}
