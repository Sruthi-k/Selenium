package testng;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class VerifyTitle {

	@Test
	public void GetTitle()
	{
	//	System.setProperty("WebDriver.chrome.driver", "D:\\Classes\\selenium jars\\chromedriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String Actual = driver.getTitle();
		Assert.assertEquals(Actual,"Google");
		//System.out.println(driver.getTitle());
	}
}
