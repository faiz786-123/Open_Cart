package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		WebElement option= driver.findElement(By.xpath("//input[@name='q']"));
		option.sendKeys("Mobiles");
		option.sendKeys(Keys.ENTER);
		 
		 

	}

}
