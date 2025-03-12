package Test1;

public class Test2 {

	public static void main(String[] args) {
		
		String input = "I am learning java";
		String output = "";
		
		for(int i = input.length()-1; i>=0; i--)
		output = output + input.charAt(i);
		
		System.out.println(output);
		
	}

}
