import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTOSH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver(); 					   //Browser launch
		driver.get("https://www.selenium.dev/downloads/");	   	 //Url insert
		
		driver.manage();
		Options op = driver.manage();
		Window w = op.window();
		w.maximize();
		
		driver.manage().window().maximize();			//method chaining browser maximize
		Thread.sleep(4000);
		
		driver.manage().window().minimize();		//(in old version 3.14 ans-NO) in new version possible minimize the version
		Thread.sleep(4000);
		
		Dimension D1 = new Dimension(100,400);  //height and width of browser
		driver.manage().window().setSize(D1);   //set size of browser
		Thread.sleep(4000);						// delay of 4 second
		
	    Point p = new Point(400,400);				// x and y coordinates of browser
		driver.manage().window().setPosition(p);		//set the size of browser
		
		
		
		String url = driver.getCurrentUrl();			//return the Url browser
		
		System.out.println(url);
		System.out.println(driver.getTitle());			//return the title of tab
		
		Navigation nv = driver.navigate();
	    nv.back();							//backward
		
		nv.forward();						//click on forward button //forward
		Thread.sleep(2000);					// wait for 2 second
		
		nv.refresh();						//browser refresh/reload
		Thread.sleep(2000);					//delay for 2 second
		
			
		driver.quit();						//all tab of BROWSER close
		//String url2 = driver.getCurrentUrl();
		driver.close();						//current tab of BROWSER close
	}
}
