package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tus.io/demo");
		driver.manage().window().maximize();
		 WebElement upload = driver.findElement(By.id("P0-0"));
		Point p1 = upload.getLocation();
	System.out.println(p1.getX());
	System.out.println(p1.getY());
		

	}

}
