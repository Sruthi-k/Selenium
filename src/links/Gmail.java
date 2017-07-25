package links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"D:\\Classes\\selenium jars\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("sonysruthi15@gmail.com");
		driver.findElement(By.id("Email")).sendKeys("\n");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("myiphone999");
		
		driver.findElement(By.xpath(".//*[@id=':ix']/div/div")).click();
		driver.findElement(By.id("pj")).click();
		driver.findElement(By.id("pj")).sendKeys("sphoorthi.pari@gmail.com");
		

	}

}
