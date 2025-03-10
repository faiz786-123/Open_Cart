package day8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		// 1) Normal alert with OK button
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		// 2) Confirmation alert - OK & Cancel
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept(); // close alert using OK button
		
		driver.switchTo().alert().dismiss(); // close the alert using Cancel button
		
		// 3) Prompt alert- Input box
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(5000);
		Alert myalert = driver.switchTo().alert();
		myalert.sendKeys("Welcome");
		myalert.accept();
		
		// syntax to handle Authenticated popup 
		//https://the-internet.herokuapp.com/javascript_alerts
		//http://username:password@https://the-internet.herokuapp.com/javascript_alerts

	}

}
