package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Classes\\selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.myntra.com/");
		driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div/div[3]/input")).click();
		driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div/div[3]/input")).sendKeys("Dresses");
		driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div/div[3]/input")).sendKeys("\n");
		
	}

}
