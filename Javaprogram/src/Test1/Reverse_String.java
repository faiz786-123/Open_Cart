package Test1;

public class Reverse_String {

	public static void main(String[] args) {

		
		
		
		
		String input = "ram";
		String output = "";
		for(int i = input.length()-1; i>=0; i--)
			
			output = output + input.charAt(i);
		boolean c1 = input.equals(output);
		System.out.println(c1);
		
		
		
	
		
		
		

	}

}
