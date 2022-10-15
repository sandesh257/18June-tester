package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTOSH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://practice.cybertekschool.com/dropdown");
		Thread.sleep(2000);
		
		WebElement Lan = driver.findElement(By.xpath("//select[@name='Languages']"));
				
		Select s = new Select (Lan);
		Thread.sleep(2000);
		
//		s.selectByValue("java");
//		Thread.sleep(1000);
//		s.selectByValue("JavaScript");
//		Thread.sleep(1000);
//		s.selectByValue("c#");
//		Thread.sleep(1000);
//		
//		s.deselectByValue("java");
//		Thread.sleep(2000);
//		
//		s.deselectByIndex(1);
//		Thread.sleep(2000);
//	    s.deselectByVisibleText("C#");
//	
//	    s.deselectAll();	
//		//System.out.println(s.getFirstSelectedOption());
//		WebElement FirstSelected = s.getFirstSelectedOption();
//		 System.out.println(FirstSelected);
//	     System.out.println(FirstSelected.getText());
//		
//		System.out.println(s.isMultiple());
//		s.getAllSelectedOptions();
		
		List<WebElement> l = s.getOptions(); // return all option of list 
		
		System.out.println(l.size());//count of option present in list box
		
		for(int i=0; i<l.size();i++ ) {
			System.out.println(l.get(i).getText());
		}
		
		
	}
}
