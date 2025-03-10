package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file upload
		driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys("C:\\Users\\LENOVO.IN\\Desktop\\myworkspaces\\Text1");
		
		//multiple file upload
		
		String file1 = "C:\\Users\\LENOVO.IN\\Desktop\\myworkspaces\\Text1";
		String file2 = "C:\\Users\\LENOVO.IN\\Desktop\\myworkspaces\\Text2";
		driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		

	}

}
