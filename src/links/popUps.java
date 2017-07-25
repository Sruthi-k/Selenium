package links;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popUps {
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver" ,"D:\\Classes\\selenium jars\\chromedriver.exe" );
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("http://www.activia.us.com/");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id='player_uid_371123912_1']/div[5]/button")).click();
//		if(driver.switchTo().alert() != null)
//		{
//		    Alert alert = driver.switchTo().alert();
//		    String alertText = alert.getText();
//		    alert.dismiss(); // alert.accept();
//
//		}
//	
		
	}

}
