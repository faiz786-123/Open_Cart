package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Automate_HDFC {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='desktop-login position-find btn btn-primary login-btn hide-in-mobileApp ng-scope']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='NetBanking']")).click();
		
		WebElement frame = driver.findElement(By.name("login_page"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("12345");
		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));


	}

}
