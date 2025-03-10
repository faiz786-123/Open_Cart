package Test1;

public class CharactorOccurance {

	public static void main(String[] args) {
		
		String str = "Java programming learning";
		
		str.length();
		str.replace("a", "").length();
		
		int count = str.length()-str.replace("a", "").length();
		
		System.out.println(count);
		

	}

}
