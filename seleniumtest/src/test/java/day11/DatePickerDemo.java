package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);
		// method1: Using .sendKeys()
		//driver.findElement(By.id("datepicker")).sendKeys("02/04/2025");
		
		// methos2: Using date picker
		String year = "1991";
		String month = "May";
		String date = "20";
		
		driver.findElement(By.id("datepicker")).click();

	}

}
