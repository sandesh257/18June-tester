import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementClass {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTOSH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    Thread.sleep(2000);
		    
		    driver.get("https://www.w3schools.com/js/js_popup.asp");			
		    Thread.sleep(2000);
	
		    driver.findElement(By.xpath(null));
	
	}
}
