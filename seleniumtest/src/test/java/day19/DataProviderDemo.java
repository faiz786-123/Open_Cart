package day19;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@DataProvider(name = "dp", indices = {0,2})
	Object[][] loginData()
	{
		Object data[][]= {
				         {"test123", "rt123"},
				         {"test133", "utt123"},
				         {"Admin", "admin123"},
				         {"test198", "rt000"},
				         {"test154", "yt123"},
				         };
		return data;
	}
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider = "dp")
	void testlogin(String email, String pwd) throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		boolean logo = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).isDisplayed();
		if(logo=true)
		{
			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}	
		
		else
		{
			Assert.fail();
		}
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}

}
