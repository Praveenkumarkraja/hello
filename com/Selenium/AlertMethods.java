package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethods {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\billa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("prompt")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Private Party");
		prompt.accept();
		
		
		
		
	}

}
