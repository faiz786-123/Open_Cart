package day17;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {
	
	@BeforeMethod
	void login()
	{
		System.out.println("This is login");
	}
	
	@Test(priority = 1)
	void search()
	{
		System.out.println("This is search");
	}
	
	@Test(priority = 2)
	void advsearch()
	{
	    System.out.println("This is adv search");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout");
	}

}
