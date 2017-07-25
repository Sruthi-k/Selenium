import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Classes\\selenium jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.expedia.com/");
	//	System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='package-origin-hp-package']")).sendKeys("DFW");
		driver.findElement(By.xpath(".//*[@id='package-destination-hp-package']")).sendKeys("MCI");
		driver.findElement(By.xpath(".//*[@id='package-departing-hp-package']")).click();
		driver.findElement(By.xpath(".//*[@id='package-departing-wrapper-hp-package']/div/div/button[2]")).click();
		driver.findElement(By.xpath(".//*[@id='package-departing-wrapper-hp-package']/div/div/div[3]/table/tbody/tr[1]/td[2]/button")).click();
		driver.findElement(By.xpath(".//*[@id='package-returning-hp-package']")).click();
		driver.findElement(By.xpath(".//*[@id='package-returning-wrapper-hp-package']/div/div/div[3]/table/tbody/tr[3]/td[2]/button")).click();
		driver.findElement(By.xpath(".//*[@id='package-rooms-hp-package']")).click();
		driver.findElement(By.xpath(".//*[@id='package-1-adults-hp-package']")).click();
		driver.findElement(By.xpath(".//*[@id='package-1-adults-hp-package']/option[3]")).click();
		driver.findElement(By.xpath(".//*[@id='package-1-children-hp-package']")).click();
		driver.findElement(By.xpath(".//*[@id='package-1-children-hp-package']/option[2]")).click();
		driver.findElement(By.xpath(".//*[@id='partialHotelBooking-hp-package']")).click();
		driver.findElement(By.xpath(".//*[@id='search-button-hp-package']")).click();
	//	driver.findElement(By.xpath("")).click();
	}

}
