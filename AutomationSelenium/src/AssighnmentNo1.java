import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssighnmentNo1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTOSH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	String title = driver.getTitle();
	System.out.println(title);
	String expected = "Google";
	
	if(title.equals(expected)) {
		System.out.println("google web page is a verified");
	}
	else {
		System.out.println("google web page is not verified");
	}
	Thread.sleep(4000);
	Options op = driver.manage();
	Window W = op.window();
	W.maximize();
	
	Dimension d1 = new Dimension(100,100);		//set size
	driver.manage().window().setSize(d1);
	
	Point pc = new Point(60,10);				// position set
	driver.manage().window().setPosition(pc);
	driver.quit();
}
}
