package Test1;

import java.util.Arrays;

public class Finding_Anagram {

	public static void main(String[] args) {
		String name1 = "ram";
		String name2 = "arm";
		
		char [] c1= name1.toCharArray();
		char [] c2= name2.toCharArray();
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
