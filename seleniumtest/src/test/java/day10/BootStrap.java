package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootStrap {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		//select single options
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); //open drop down options
		
		//select single option
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//select all options from drop down and find out size
		
		List <WebElement>options=driver.findElements(By.xpath("//*[@class='checkbox']"));
		System.out.println("Number of options " + options.size());
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		//select multiple options
		for(WebElement op:options)
		{
			String op1 = op.getText(); 
			if(op1.equals("Java") || op1.equals("Python"))
			{
			    op.click();
			}
			}
			

	}

}
