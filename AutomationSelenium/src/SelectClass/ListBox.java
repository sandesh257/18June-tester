package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTOSH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()=('Create New Account']")).click();
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(3000);
		
		Select s = new Select (month);
		Thread.sleep(3000);
		
		s.selectByIndex(4);
		Thread.sleep(3000);
		
		s.selectByValue("12");
		Thread.sleep(3000);
		
	    s.selectByVisibleText("jan");
		
	}
}
