package day22;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_ORG {
	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void testLogin()
	{
		PageObject lp = new PageObject(driver);
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}

}
