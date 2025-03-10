package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10)); //Condition
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@placeholder = 'Email address or phone number']")).sendKeys("faizshahnaz057@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("faiz659038");
		driver.findElement(By.name("login")).click();
		
		//WebElement login = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));
		
	}

}
