package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Where are you going?']")).sendKeys("Banglore");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-testid='date-display-field-start']")).sendKeys("2025-02-02");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();



	}

}
