package com.indeed.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Create FireFox Driver
		System.setProperty("webdriver.chrome.driver", "D:\\Classes\\selenium jars\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		//Open page
		driver.get("http://www.indeed.com");
		
		//Field = Selenium
		Thread.sleep(2000);
		driver.findElement(By.id("what")).sendKeys("Selenium");
		//Location = Irving,Tx
	
//		driver.findElement(By.id("where")).clear();
//		driver.findElement(By.id("where")).sendKeys("Irving,Tx");
//		
//		//Find Findjobs Button and Click on it
		//Thread.sleep(2000);
//		driver.findElement(By.id("fj")).click();
//		//Get page title and jobs count 
//		//Search Count
//
//		System.out.println("driver.getTitle()");
//	System.out.println(driver.findElement(By.id("serachCount")).getText());
		//Locating Link
		//driver.findElement(By.linkText("Upload your resume")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//img[@title='Indeed Job Search']")).getAttribute("src"));
	//	driver.findElement(By.partialLinkText("Post Job")).click();
//		driver.close();
	}

}
