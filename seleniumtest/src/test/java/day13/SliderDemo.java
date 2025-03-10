package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement min_slider =driver.findElement(By.xpath("//span[@style='left: 0%;']"));
		System.out.println(min_slider.getLocation());
		
		//Slider dragAndDropBy(min_slider, x, y)
		act.dragAndDropBy(min_slider, 100, 249).perform();
		
		System.out.println(min_slider.getLocation());
		
		
		
				

	}

}
