package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugggestionDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("selenium");
		List <WebElement> auto=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		int count = auto.size();
		System.out.println(count);
		for(WebElement op:auto)
		{
			System.out.println(op.getText());
		}
		
		auto.get(count-2).click();
		

	}

}
