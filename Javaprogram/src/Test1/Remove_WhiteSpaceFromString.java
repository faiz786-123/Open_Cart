package Test1;

public class Remove_WhiteSpaceFromString {

	public static void main(String[] args) {
		
		String str = "Java   programming   selenium";
		
		str = str.replaceAll("\\s", "");
		
		System.out.println(str);



	}

}
