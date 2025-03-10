package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		//driver.findElement(By.xpath(" )).sendKeys("TShirt");
		
		//xpath with multiple attribute
		
		//driver.findElement(By.xpath("//input[@name= 'search'][@placeholder= 'Search']")).sendKeys("Tshirt");
        
		//xpath with inner text - text()
		//driver.findElement(By.xpath("//*[text()= 'Mackbook']")).click();
		boolean displaystatus = driver.findElement(By.xpath("//h3[text()= 'Featured']")).isDisplayed();
		System.out.println(displaystatus);
		
		//String value = driver.findElement(By.xpath("//h3[text()= 'Featured']")).getText();
		//System.out.println(value);
		
		//xpath with contains() 
		
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
		
}
}