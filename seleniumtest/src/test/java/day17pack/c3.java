package day17pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class c3 {
	
	@Test
	void pqr()
	{
		System.out.println("This is pqr from c3");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is After Suite method");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is Before Suite method");
	}

}
