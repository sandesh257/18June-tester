package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBro {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTOSH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    Thread.sleep(2000);
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(1000);
	
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
		
		String expUrl4="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		Set <String> allAdd = driver.getWindowHandles();
	
		ArrayList<String>ar = new ArrayList<String>(allAdd);
		
		
		String id = ar.get(2);
		driver.switchTo().window(ar.get(2));
		
//		for (String s1: allAdd) {
//			System.out.println(s1);
//			
//			driver.switchTo().window(s1);
//			String actURL = driver.getCurrentUrl();
//			
//			if(expUrl4.equals(actURL) ){
//				System.out.println("corrent window");
//			}
	//		driver.findElement(By.xpath("//a[@href='javascript:void(0);'][4]")).click();
			//break;
			 
		}
	}
