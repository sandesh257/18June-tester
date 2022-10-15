import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTOSH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    Thread.sleep(2000);
		    
		    driver.get("https://www.amazon.in");
		    Thread.sleep(2000);
		    
		   WebElement ChangeLanguage = driver.findElement(By.xpath("//a[@aria-label='Choose a language for shopping.']"));
		   
		  Actions act = new Actions (driver);
		   
		   act.moveToElement(ChangeLanguage).perform();
		   Thread.sleep(2000);
		 //  act.contextClick().perform();
		  // act.click(ChangeLanguage).perform();
		   //act.doubleClick().perform();
		  // WebElement ChangeLanguage=driver.findElement(By.xpath("//div[@class='a-row a-spacing-mini'][2]"));
		   //Actions act = new Actions (driver);
		   //Thread.sleep(1000);
		   //act.doubleClick(ChangeLanguage).perform();
		   //Thread.sleep(1000);
		   
		   //act.moveToElement(ChangeLanguage).click().build().perform();
		   
		//   act.dragAndDrop(src,dest);
		   
		  // act.clickAndHold(src);
		   
		   //act.release(dest);
}
}