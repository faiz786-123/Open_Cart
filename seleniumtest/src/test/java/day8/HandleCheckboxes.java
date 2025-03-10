package day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// 1) select specific checkbox
		//driver.findElement(By.id("male")).click();
		
		// 2) select all the checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class = 'form-check-input' and @type = 'checkbox' ]"));
		/*for(int i = 0; i<checkboxes.size(); i++) 
		{
			checkboxes.get(i).click();
			
			
			
		}*/
		
		for(WebElement checkbox:checkboxes) 
		{
			checkbox.click();
			
		}
			
		
		

	
		
	}

}
