package day15;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureBrokenLink {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
	   List <WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println(links.size());
	    for(WebElement total_links:links)
	    {
	    	String options = total_links.getDomAttribute("href");
	    	System.out.println(options);
	    	if (options == null || options.isEmpty())
	    	{
	    		System.out.println("options value is empty");
	    		continue;
	    	}
	    	
	    
	    
	   
	    
	    }
	}

}
