package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_StaleElementReferenceException {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.cogmento.com/?lang=en");
		driver.manage().window().maximize();
		WebElement user_name = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		user_name.sendKeys("faiz");
		
		WebElement psd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		psd.sendKeys("123");
		driver.navigate().refresh();
		
		try {
		user_name.sendKeys("faiz");
		}
		catch(StaleElementReferenceException e)
		{
			user_name = driver.findElement(By.xpath("//input[@placeholder='Email']"));
			user_name.sendKeys("faiz");
		}

	}

}
