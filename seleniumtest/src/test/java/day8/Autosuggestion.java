package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		search.sendKeys("Virat");
		Thread.sleep(3000);
		List<WebElement>total= driver.findElements(By.xpath("//ul[@class='G43f7e']/li "));
		int count = total.size();
		System.out.println(count);
		total.get(count-1).click();
		
	}

}
