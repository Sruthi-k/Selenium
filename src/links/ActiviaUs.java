package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActiviaUs {
	WebDriver driver;
		
	
	public static void main(String[] args) throws Exception {
	
	
		System.setProperty("webdriver.chrome.driver" ,"D:\\Classes\\selenium jars\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("http://www.activia.us.com/store-locator");
		driver.manage().window().maximize();
	
		
//	@Test
//	public void urlactivities() 
	{
		driver.get("http://simu.activia.us.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/ul/li[5]/a")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/ul/li[6]/a")).click();
	
		
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath(".//*[@id='panel1AddressField']")).sendKeys("missouri");  
		driver.findElement(By.xpath(".//*[@id='panel1AddressField']")).sendKeys("\n");
//	}
	
	//driver.findElement(By.xpath("//*[@id='panel1ProductName1']")).click(); //Click Strawberry 4-Pack
	
	//@Test
	
	//public void close()
//	{
	Thread.sleep(5000);
		driver.close();
		}
	}
}
	//	Thread.sleep(2000);
	//	driver.close();
	/*	driver.findElement(By.linkText("Where to Buy")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='panel1AddressField']")).sendKeys("missouri");
		driver.findElement(By.xpath("//*[@id='panel1AddressField']")).sendKeys(" \n");*/
		
	





/*List<WebElement> frames = driver.findElements(By.tagName("iframe"));
for(int i=0;i<frames.size();i++){
	System.out.println(frames.get(i).getText());
}*/
//System.out.println(frames.size());
/*driver.switchTo().frame(0);
driver.findElement(By.xpath("//*[@id='panel1AddressField']")).sendKeys("missouri");
driver.findElement(By.xpath("//*[@id='panel1AddressField']")).sendKeys(" \n");*/
//driver.manage().window().maximize();
/*Thread.sleep(2000);
driver.findElement(By.linkText("It Starts Inside")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("Probiotic Yogurts")).click();
Thread.sleep(2000);*/
//driver.findElement(By.linkText("Where to Buy")).click();
//		driver.findElement(By.partialLinkText("Where to Buy")).click();driver.switchTo().frame(0);
//driver.findElement(By.xpath("//*[@id='panel1AddressField']")).sendKeys("missouri");
//driver.findElement(By.className("panel_1_address_field panel_1_required panel_1_required_error")).click();
//	driver.findElement(By.cssSelector("#panel1SubmitButton1")).click();
//	driver.findElement(By.xpath("//*[@id=panel1SubmitButton1]")).click();
//driver.findElement(By.className("panel_1_address_field panel_1_address_field_base panel_1_required")).sendKeys("Irving");
//driver.findElement(By.id("panel1AddressField")).sendKeys("Irving, TX 75063 USA");
//	driver.findElement(By.linkText("Strawberry 4-Pack"));
//driver.findElement(By.xpath("//*[@id=panel1ProductName1]")).click();
//	driver.findElement(By.id("panel1ProductName39")).click();

//	driver.findElement(By.xpath("//*[@id=panel1ProductName39]")).click();
//Thread.sleep(2000);
//driver.close();
