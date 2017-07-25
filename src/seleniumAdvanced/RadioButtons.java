package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class RadioButtons {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Classes\\selenium jars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	

   //     WebDriver driver=new FirefoxDriver();
        

        driver.manage().window().maximize();

        driver.get("http://www.facebook.com");

        WebElement male_radio_button=driver.findElement(By.id("u_0_k"));

        boolean status=male_radio_button.isDisplayed();

        System.out.println("Male radio button is Displayed >>"+status);

        boolean enabled_status=male_radio_button.isEnabled();

        System.out.println("Male radio button is Enabled >>"+enabled_status);

        boolean selected_status=male_radio_button.isSelected();

        System.out.println("Male radio button is Selected >>"+selected_status);

        male_radio_button.click();

        boolean selected_status_new=male_radio_button.isSelected();

        System.out.println("Male radio button is Selected >>"+selected_status_new);


}
}