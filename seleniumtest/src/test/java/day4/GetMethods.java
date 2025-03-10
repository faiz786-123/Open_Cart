package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//get(URL) - open the url on the browser
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		//get(title) - open the title of the page
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.getWindowHandles());
		
		//isDisplayed()
		WebElement logo = driver.findElement(By.xpath("//img[@title = 'Flipkart']"));
		System.out.println(logo.isDisplayed());
		
		
		//isEnabled()
		boolean status = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).isEnabled();
		System.out.println("Enable status:"+ status);
		
		
		//isSelected()
		WebElement male_rd = driver.findElement(By.xpath("//input[@id = 'gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id = 'gender-female']"));
		
		System.out.println("Before selection........");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		male_rd.click();
	}

}
