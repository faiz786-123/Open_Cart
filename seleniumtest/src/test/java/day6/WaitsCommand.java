package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsCommand {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@placeholder = 'Email address or phone number']")).sendKeys("faizshahnaz057@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("faiz659038");
		driver.findElement(By.name("login")).click();
		
	}

}
