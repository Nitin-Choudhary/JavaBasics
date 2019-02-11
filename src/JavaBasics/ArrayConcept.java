package JavaBasics;

public class ArrayConcept {
//Disadvantage of array
// 1. size is fixed - static array :- TO overcome this problem, we use collections-- arraylist, hashtable --use dynamic array
// 2. store only similar data type:- To overcome this problem, we use object array 
	
	public static void main(String[] args) {
	// 1. integer array
	int array[] = new int[4];
	 array[0] = 10;
	 array[1] = 20;
	 array[2] = 50;
	 array[3] = 40;
	 int temp;
	//Print all the value of arrays
	 for(int j=0;j<array.length;j++) {
		 System.out.println(array[j]);
	
	}
	//Sort the array
		 for(int i=1;i<array.length;i++) {
			for(int j=i;j>0;j--) {
				if(array[j]<array[j-1]) {
					temp = array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	//2. Double array :- double d[] = new double[3];
	//3. Character array :- char c[] = new char[2];
	//4. boolean array:- 	 boolean b[] = new boolean[2];
	 //5. string array
	 String s[] = new String[3];
	 s[0] = "Test";
	 s[1] = "hello";
	 s[2] = "world";
	 System.out.println(s.length);
	//6. Object array (Object is a class it is a super class of all the classes)
	 Object ob[] = new Object[6];
	 ob[0] = "Tom";
	 ob[1]=25;
	 ob[2]=32.5;
	 ob[3]="1/1/1990";
	 ob[4]='W';
	 ob[5]="london";
	 System.out.println(ob[5]);
	 

}
}