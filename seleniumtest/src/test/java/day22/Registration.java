package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Registration {
	
	WebDriver driver;

	@BeforeClass
	void setUp() {
		
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
	}
	    @Test
		void testRegistration() throws InterruptedException
		{
	
	    driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Mohd");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Faiz");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("faizshahnaz057@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Faiz@123");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Your Account Has Been Created!");
		}
	    
	    @AfterClass
	    void tearDown()
	    {
	    	driver.close();
	    }

	}

