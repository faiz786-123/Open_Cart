package Test1;

public class Exception_Handling {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		int a = 10, b= 0, c;
		
		try {
		c = a/b;
		System.out.println(c);
		}
		
		catch(Exception e)
		{
		System.out.println(e);
		}
		
		System.out.println("Main method ended");
		

	}

}
