package friendly;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DatePicker {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Classes\\selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Chrome Driver
		driver.manage().deleteAllCookies(); // Deleting cookies
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize()); //Size of window
		
		driver.get("https://www.expedia.com/"); //Getting URL

		

		JavascriptExecutor scr = (JavascriptExecutor) driver; //Using JavaScript

		scr.executeScript("document.getElementById('package-departing-hp-package').value='07/29/2017'"); //datePicker by ID
	
		/*driver.get("http://demo.automationtesting.in/");
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@href='Widgets.html']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[@href='Datepicker.html']"))).click().build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("doucument.getElementById('datepicker1').value='09/12/2017'", "");*/
		
		

	}


}
