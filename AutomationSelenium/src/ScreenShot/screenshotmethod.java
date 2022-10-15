package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotmethod {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTOSH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		  
			Thread.sleep(2000);
	
	 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);					//screenshot sathi 
	  
	 File Dest = new File("C:\\Users\\SANTOSH\\eclipse-workspace\\AutomationSelenium\\Screenshot\\test.jpg");
	 
	 FileHandler.copy(source, Dest);
	
	}
}
