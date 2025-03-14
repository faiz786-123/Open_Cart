package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindColorOfButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
	    WebElement button = driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']"));
		
	   System.out.println(button.getCssValue("background-color"));

	}

}
