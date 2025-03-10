package day17;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	
	@Test
	void testTitle()
	{
		String exp_title = "OpenCart";
		String act_title = "OpenShop";
		
		Assert.assertEquals(exp_title, act_title);
	}

}
