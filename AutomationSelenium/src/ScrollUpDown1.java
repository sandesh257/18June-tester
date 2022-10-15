import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown1 {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTOSH\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    Thread.sleep(2000);
		    
		    driver.get("https://www.w3schools.com/js/js_popup.asp");			
		    Thread.sleep(2000);
		    
		  WebElement tryIt = driver.findElement(By.xpath(("//a[text()='Try it Yourself »'])[2]")));
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    
//		    js.executeScript("arguments[0]scrollInto Viwe(true)", tryIt);
//		   Thread.sleep(2000);
  
		    
		    js.executeScript("Window.scrollBy(0,3000");			//scroll Down
		    Thread.sleep(2000);
		    
		    js.executeScript("Window.scrollBy(0,-1000");		//scroll Up
		    Thread.sleep(2000);
		    
//		    js.executeScript("Window.scrollBy(1000,0");			//scroll Right
//		    Thread.sleep(2000);
//		    
//		    js.executeScript("Window.scrollBy(-3000,o");		//scroll Left
//		    Thread.sleep(2000);
//		    
//		    js.executeScript("Window.scrollBy(1000,2000");		//scroll Right & scroll Down
//		    Thread.sleep(2000);
//		    
//		    js.executeScript("Window.scrollBy(-3000,2000");		// Scroll Left & Scroll down
//		    Thread.sleep(2000);
//		    
//		    js.executeScript("Window.scrollBy(-1000,-2000");	// Scroll Right & Scroll Up
//		    Thread.sleep(2000);
//		    
//		    js.executeScript("Window.scrollBy(-3000,-3000");	//scroll Left & Scroll Up
//		    Thread.sleep(2000);
//		    
//		    
	}
	
}
