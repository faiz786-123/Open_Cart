package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		WebElement elmt = driver.findElement(By.xpath("//img[@title='Show details for Build your own computer']"));
		js.executeScript("arguments[0].scrollIntoView();", elmt);

	}

}
