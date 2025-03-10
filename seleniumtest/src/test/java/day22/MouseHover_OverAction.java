package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHover_OverAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement Fashion= driver.findElement(By.xpath("//span[.='Fashion'][1]"));
		Actions act = new Actions(driver);
		act.moveToElement(Fashion).perform();
		driver.findElement(By.linkText("Men's T-Shirts")).click();
		
		
		

	}

}
