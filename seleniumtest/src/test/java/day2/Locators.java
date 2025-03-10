package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		//boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplayStatus);
		
		//LinkText and PartialLinkText
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Table")).click();
		
		//className
		//List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
		//System.out.println("total number of header links:" +headerLinks.size());
		
		//tagName
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total number of links:" +links.size());
		

	}

}
