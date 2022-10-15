import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTOSH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    Thread.sleep(2000);
		    
		    driver.get("https://www.w3schools.com/js/js_popup.asp");			//parent tab
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();    // 4th tab window
		    Thread.sleep(1000);
		    
		    driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']")).click();    // 3th tab
            Thread.sleep(1000);
             
            driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_prompt']")).click();      // 2nd tab
		    Thread.sleep(1000);
		    
		    driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert2']")).click();      //1st tab
		    Thread.sleep(1000);
		    
		   Set<String> main = driver.getWindowHandles();
		   
		   ArrayList <String>arr=new ArrayList<String>(driver.getWindowHandles());
		   Thread.sleep(1000);
		   
		   String id=arr.get(1);
		   driver.switchTo().window(id);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		//    ArrayList<String>ar = new ArrayList<String>(driver.getWindowHandles());
	//
		//    driver.switchTo().window(ar.get(1));
		  //  Thread.sleep(1000);
		    //
		    //WebElement frame = driver.findElement(By.xpath(null))
	}
}
