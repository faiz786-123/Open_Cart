package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement firs_tname;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement last_name;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement e_mail;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement Pwd;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement continue_btn;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement agree_btn;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void setFirstName(String fname)
	{
		firs_tname.sendKeys(fname);
	}

	public void setLastName(String lname)
	{
		last_name.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		e_mail.sendKeys(email);
	}
	
	public void setPassword(String pas)
	{
		Pwd.sendKeys(pas);
	}
	
	public void setPrivacy()
	{
		agree_btn.click();
	}
	
	public void clickContinue()
	{
		continue_btn.click();
	}
	
	public String getConfirmationMsg(){
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
		
	}
}
