package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTOSH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='button'][2]")).click();
		Thread.sleep(1000);
			
		TargetLocator t= driver.switchTo();
		Thread.sleep(4000);
		Alert alt =  t.alert();
		//alt.accept();
		//Thread.sleep(8000);
		
		//alt.dismiss();
		
		alt.sendKeys("patil");
	}		
}
