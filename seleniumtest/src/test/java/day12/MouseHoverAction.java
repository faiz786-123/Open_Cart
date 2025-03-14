package day12;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement computers = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
		WebElement notebooks = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']"));
		
		Actions act = new Actions(driver);
		
		//mouse hover action
		act.moveToElement(computers).moveToElement(notebooks).build().perform();
	}

}
