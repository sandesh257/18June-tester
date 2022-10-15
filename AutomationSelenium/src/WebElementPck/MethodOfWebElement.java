package WebElementPck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodOfWebElement {

	private static final WebElement LoginButton = null;

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTOSH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    driver.get("https://www.w3schools.com/js/js_popup.asp");
	    Thread.sleep(2000);

	    driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();					//alert     1tab
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']")).click();                 //confirm box  2tab
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_prompt']")).click();				//prompt box	3tab
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert2']")).click();				//line break or alert2   	4tab
		Thread.sleep(2000);
		String mainwindowId= driver.getWindowHandle();
		String expUrl="https://www.w3schools.com/js/js_popup.asp";
		Thread.sleep(2000);
		
	   WebElement web = driver.findElement(By.xpath("//a[@title='Change Theme']"));

	   web.click();
	   Thread.sleep(2000);
	   System.out.println(web.isSelected());   					//false
	   
	   
	   WebElement loginButtton = driver.findElement(By.xpath("//button[@id='runbtn']"));
	   System.out.println(LoginButton.isEnabled());
	 System.out.println(LoginButton.isDisplayed());
	}
}
