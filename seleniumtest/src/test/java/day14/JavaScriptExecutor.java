package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inputbox =driver.findElement(By.xpath("//input[@id='name']"));
		
		//passing the text into inputbox - Alternate of .sendKeys();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Rohit')", inputbox);
		
		//clicking on element - Alternate of .click();
		WebElement radio_button = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", radio_button);
		

	}

}
