package day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.orangehrm.com/");

	}

}
