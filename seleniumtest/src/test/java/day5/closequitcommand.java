package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closequitcommand {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.zoho.com/register?servicename=ZohoSupport&serviceurl=https%3A%2F%2Fsupport.orangehrm.com%2Fsupport%2Forangehrm%2FShowHomePage.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id = 'footer']")).click();
		
		//close() command will close single browser window
		driver.close();
		
		// quit() command will close all browser window
		driver.quit();

	}

}