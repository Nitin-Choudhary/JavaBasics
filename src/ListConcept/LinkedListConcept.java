package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	
		LinkedList<String> ll =  new LinkedList<String>();
		
		//add
		ll.add("Test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//print:
		System.out.println("Content of LinkedList:"+ll);
		//addfirst
		ll.addFirst("Nitin");
		ll.addLast("Automation");
		System.out.println("Content of LinkedList:"+ll);
		
		//get:
		System.out.println(ll.get(0));
		
		//set:
		ll.set(0, "Tommy");
		System.out.println(ll.get(0));
		
		//remove first element and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of LinkedList:"+ll);
		
		ll.remove(1);
		System.out.println("Content of LinkedList:"+ll);
		
		//how to print all the value of linklist
		//for loop
		//advacne for loop
		//iterator
		//while loop
		System.out.println("***Using For Loop***");
		for(int n=0;n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		System.out.println("***Using Advance For loop***");
		for(String str:ll) {
			System.out.println(str);
		}
		System.out.println("***Using iteratror***");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("***Using While loop***");
		//while loop
		int num =0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	
		
		
	}

}
