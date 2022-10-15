import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTOSH\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).sendKeys("sandesh patil");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.xpath("//input[@type='text']"));
		driver.findElement(By.name("email")).sendKeys("sandeshpatil");
		//driver.quit();  //all the tab of the browser
		//driver.close();  //current tab close
	}

}
//C:\Users\SANTOSH\Downloads\chromedriver_win32
//C:\\Users\\SANTOSH\\Downloads\\chromedriver_win32 (2)