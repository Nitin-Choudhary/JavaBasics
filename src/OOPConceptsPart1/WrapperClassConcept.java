package OOPConceptsPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+20);
		//data coversion from string to integer
		int i = Integer.parseInt(x); //Integer is wrapper class other classe are Double, Character, Boolean
		System.out.println(i+20);
		
		//String to double coversion
		String s = "12.33";
		double k = Double.parseDouble(s);
		System.out.println(k+10);
		
		//String to character not possible
		//String to boolean
		String c = "true";
		boolean b = Boolean.parseBoolean(c);
		System.out.println(b);
		
		//int to string conversion
		int j = 200;
		String s1 = String.valueOf(j);
		System.out.println(j+s1);
		
		//Numberformat exception:- if the string is not pure number and you try to convert to integer
		
		String u = "100A";
		Integer.parseInt(u);//NumberFormateException.

	}

}
