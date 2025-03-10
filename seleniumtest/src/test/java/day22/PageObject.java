package day22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	WebDriver driver;
	
	PageObject(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement text_username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement text_pwd;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login_btn;
	
	public void setUserName(String user)
	{
		text_username.sendKeys(user);
	}
	
	public void setPassword(String pwd)
	
	{
		text_pwd.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		login_btn.click();
	}
	

}
