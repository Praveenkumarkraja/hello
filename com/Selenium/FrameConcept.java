package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\billa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("praveen");
		driver.findElement(By.name("lname")).sendKeys("kumar");
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.name("email")).sendKeys("praveen@gmail.com");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		
		
		
	}
	
	

}
