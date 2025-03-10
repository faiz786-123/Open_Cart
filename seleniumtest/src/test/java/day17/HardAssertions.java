package day17;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	void test()
	{
		//Assert.assertEquals("xyz", "xyz");
		
		Assert.assertNotEquals(123, 123);
	}

}
