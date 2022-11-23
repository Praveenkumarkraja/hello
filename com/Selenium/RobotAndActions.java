package com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotAndActions {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\billa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Actions ac = new Actions(driver);
		Robot rb = new Robot();
		
	   WebElement src = driver.findElement(By.id("draggable"));
	   WebElement des = driver.findElement(By.id("droppable"));
		
	   ac.dragAndDrop(src, des).build().perform();
	   driver.navigate().to("https://www.amazon.in/");
	   
	   WebElement fashion = driver.findElement(By.linkText("Fashion"));
	   ac.moveToElement(fashion).perform();
	  
	   
	   WebElement electronics = driver.findElement(By.linkText("Electronics"));
	   ac.contextClick(electronics).perform();
	   
	   rb.keyPress(KeyEvent.VK_DOWN);
	   rb.keyRelease(KeyEvent.VK_DOWN);
	   
	   
	   rb.keyPress(KeyEvent.VK_ENTER );
	   rb.keyRelease(KeyEvent.VK_ENTER );
	   
	   
	   
		
		
}

}
