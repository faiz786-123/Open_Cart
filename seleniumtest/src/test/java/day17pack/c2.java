package day17pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class c2 {
	
	@Test
	void xyz()
	{
		System.out.println("This is xyz from c2");
	}
	
	@AfterClass
	void at()
	
	{
		System.out.println("This is after test method");
	}

}
