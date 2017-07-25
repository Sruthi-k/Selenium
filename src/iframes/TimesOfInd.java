package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TimesOfInd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Classes\\selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://timesofindia.indiatimes.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/span/a[1]")).click(); //Not-now PopUp
		WebElement wel = driver.findElement(By.xpath("//*[@id='nav-world']/a")); //World
		Actions act = new Actions(driver);
		act.moveToElement(wel).perform();
		driver.findElement(By.xpath("//*[@id='30359486']/a")).click(); //US 
		driver.findElement(By.xpath("//*[@id='fsts']/h2/a")).click();
		

	}

}
