package Test1;

public class PalindromeNumber {

	public static void main(String[] args) {
		String input = "book";
		String output = "";
		for(int i = input.length()-1; i>=0; i--)
		{
			char c1 = input.charAt(i);
			output = output + c1;
		}
		System.out.println(output);
		boolean b1 = input.equals(output);
		System.out.println(b1);
	}

}
