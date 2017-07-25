package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestion {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Classes\\selenium jars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); //Chrome Driver
//WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();

driver.get("http://www.google.com");

// Type on textbox
driver.findElement(By.id("'lst-ib")).sendKeys("test");

// Create object on Actions class
Actions builder=new Actions(driver);

// find the element which we want to Select from auto suggestion
WebElement ele=driver.findElement(By.xpath(".//*[@id='sbse1']/div[2]"));

// use Mouse hover action for that element
builder.moveToElement(ele).build().perform();

// Give wait for 2 seconds 
Thread.sleep(2000);

// finally click on that element
builder.click(ele).build().perform();
}


}