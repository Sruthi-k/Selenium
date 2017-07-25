package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Classes\\selenium jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/selenium/guru99home/");
		int size = driver.findElements(By.tagName("iframe")).size();
		
	//	driver.findElement(By.xpath(".//*[@id='rt-showcase']/div/div[1]/div/div/div/div/div[2]/div")).click();
 
	}

}
