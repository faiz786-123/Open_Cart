package day15;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1) Full Page Screenshot
		
		/*
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile);
		*/
		
		//2) Capture screenshot of the specific section
		/*
		WebElement featuredproducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile = featuredproducts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\featuredproducts.png");
		sourcefile.renameTo(targetfile);
		
		*/
		
		//3) capture the screenshot of Webelement 
		
		WebElement log = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile = log.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		sourcefile.renameTo(targetfile);
		
		
		
		driver.quit();
		
		
		

	}

}
