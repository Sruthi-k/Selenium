package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {

		
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Classes\\selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
	//	WebDriver driver=new FirefoxDriver() ;
		//open and launch url 
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement monthdd=driver.findElement (By.xpath("//select[@id='month']"));
		
		Select Month= new Select (monthdd);
		
		Month.selectByIndex(2);
					
		Month.selectByValue("11");
								
		Month.selectByVisibleText("Aug");
						
		WebElement selectedmonth=Month.getFirstSelectedOption();
		
		System.out.println("Selected Month is " + selectedmonth.getText());
				
		List <WebElement> Monthlist = Month.getOptions();
		
		int totalmonth=Monthlist.size();
		
		System.out.println("Total month is " + totalmonth);
				
             
		
	}
	
	
}
	
}