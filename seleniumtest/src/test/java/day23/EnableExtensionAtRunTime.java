package day23;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionAtRunTime {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		File file = new File("C:\\Users\\LENOVO.IN\\Downloads\\SelectorsHub-XPath-Helper-Chrome-Web-Store");
        options.addExtensions(file);
        
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
	}

}
