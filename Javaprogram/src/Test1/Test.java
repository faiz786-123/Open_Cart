package Test1;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		String str = "ram";
		String str1 = "arm";
		
		char [] c1 = str.toCharArray();
		char [] c2 = str.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)==true)
		{
			System.out.println("They are anagram");
		}
		
		else
		{
			System.out.println("They are not anagram");
		}

}
}