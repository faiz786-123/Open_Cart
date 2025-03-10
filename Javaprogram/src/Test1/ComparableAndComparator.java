package Test1;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableAndComparator {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(34);
		marks.add(23);
		marks.add(54);
		System.out.println(marks);
		
		Collections.sort(marks);
		System.out.println(marks);
	

	}

}
