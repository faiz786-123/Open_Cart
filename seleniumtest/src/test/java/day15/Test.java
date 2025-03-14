package day15;


import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot	ts = (TakesScreenshot)driver;
	File sourcefile = ts.getScreenshotAs(OutputType.FILE);
	File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
	sourcefile.renameTo(targetfile);
		

	}

}
