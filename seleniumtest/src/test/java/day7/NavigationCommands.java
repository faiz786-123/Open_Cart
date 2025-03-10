package day7;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();

	}

}
