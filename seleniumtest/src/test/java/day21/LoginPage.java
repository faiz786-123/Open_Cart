package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	WebDriver driver;
	
	// constructor 
	
	LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// Locators 
	
	By text_usernane_loc = By.xpath("//input[@placeholder='Username']");
	By text_password_loc = By.xpath("//input[@placeholder='Password']");
	By btn_login_loc = By.xpath("//button[normalize-space()='Login']");
	
	// Action methods
	
	public void setUserName(String user)
	{
		driver.findElement(text_usernane_loc).sendKeys("user");
		
	}

	public void setPassword(String pwd)
	{
		driver.findElement(text_password_loc).sendKeys("pwd");
	}
	

	public void clichLogin()
	{
		driver.findElement(btn_login_loc).click();
	}
}
