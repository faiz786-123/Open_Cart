package day1;

/*
Test case
----------
1) Launch browser (chrome)
2) Open URL https://www.facebook.com/
3) Validate title should be "Facebook – log in or sign up"
4) close browser
 */

import org.openqa.selenium.chrome.ChromeDriver;



public class FirstTestCase {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String act_title = driver.getTitle();
		if(act_title.equals("Facebook – log in or sign up")) 
		{
			System.out.println("Test Pass");
		}
		else 
		{
			System.out.println("Test Failed");
		}
		
		driver.close();
	}

}
