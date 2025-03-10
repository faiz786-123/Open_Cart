package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
	}
    
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	@Test
	public void verify_account_registration()
	{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		regpage.setFirstName("Mohd");
		regpage.setLastName("Faiz");
		regpage.setEmail("faizshahnaz057@gmail.com");
		regpage.setPassword("Faiz@1991");
		regpage.setPrivacy();
		regpage.clickContinue();
		String confmsg = regpage.getConfirmationMsg();
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		
	}
}
