package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Classes\\selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://simu.activia.us.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Where to Buy")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@id='panel1AddressField']")).sendKeys("missouri");  
		driver.findElement(By.xpath(".//*[@id='panel1AddressField']")).sendKeys("\n");  
	}

}
