package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		
		
		WebElement amount =driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		WebElement Debit = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(amount, Debit).perform();
		
	}

}
