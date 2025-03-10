package day10;

import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpElement = driver.findElement(By.id("country"));
		Select options = new Select(drpElement);
		//options.selectByContainsVisibleText("France");
		//options.selectByValue("usa");
		//options.selectByIndex(3);
		
		//capture the options from the drop down
		List <WebElement >total_option = options.getOptions();
		System.out.println("Number of options is " + total_option.size());
		
		//printing the options
		
		/*for(int i = 0; i<total_option.size(); i++)
		{
			System.out.println(total_option.get(i).getText());
			
		}
		*/
		//enhance loop
		for(WebElement op:total_option)
		{
			System.out.println(op.getText());
		}

	}

}
