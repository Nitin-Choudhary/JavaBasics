package ExceptionHandling;

public class ThrowKeyword{
	public static void main(String[] args) {
		System.out.println("ABC");
		try {
		throw new Exception("Nitin Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}


		
		System.out.println("PQR");
	}
}
//Different between throw and throws?
// throw:- deliberately throw exception through throw 