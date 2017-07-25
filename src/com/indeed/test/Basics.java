package com.indeed.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Classes\\selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
	//	System.out.println(driver.getCurrentUrl());
	//	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Crazy");
	//	driver.findElement(By.xpath("//div[@id:'reg_form_box']/div[1]/div[1]/div[1]/div[1]/div/input"))
	//	driver.findElement(By.className("input")).sendkeys("Dirty Fellow");
	//	driver.close();	
		driver.findElement(By.id("u_0_1")).sendKeys("Crazy");
		driver.findElement(By.name("lastname")).sendKeys("Spruthi");
		driver.findElement(By.id("u_0_6")).sendKeys("3124980812");
	//	driver.findElement(By.id("u_0_1")).click();
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();

	}

}
