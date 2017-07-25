package links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver" ,"D:\\Classes\\selenium jars\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com");
		driver.findElement(By.xpath("//*[@id='login-email']")).sendKeys("********");
		driver.findElement(By.xpath("//*[@id='login-password']")).sendKeys("*****");
		driver.findElement(By.xpath("//*[@id='login-submit']")).click();
		driver.findElement(By.xpath("//*[@id='mynetwork-tab-icon']")).click();
		driver.findElement(By.cssSelector("//*[@id='ember5219']/ul/li[1]/div[2]/button[1]")).click();

	}

}
