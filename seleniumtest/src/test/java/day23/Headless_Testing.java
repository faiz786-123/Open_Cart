package day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Testing {

	public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String act_title = driver.getTitle();
		
		if(act_title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			System.out.println("Test Passed");
			
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.quit();

	}

}
