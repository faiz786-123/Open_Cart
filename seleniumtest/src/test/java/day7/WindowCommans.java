package day7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowCommans {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		System.out.println(driver.getWindowHandles());
		System.out.println("Title of the window: " + driver.getTitle());
		//Set<String> windowIDs = driver.getWindowHandles();
		
		//List<String> windowList = new ArrayList(windowIDs);
		
		//String parentID = windowList.get(0);
		//String childID = windowList.get(1);
		
		//for(String winId:windowIDs)
		//{	
		//	String title = driver.switchTo().window(winId).getTitle();
			//if(title.equals("OrangeHRM"))
		//	{
				//System.out.println(driver.getCurrentUrl());
			//}
		
	}

}