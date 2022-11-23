package com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\billa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    
	    Actions ac = new Actions(driver);
	    Robot rb = new Robot();
	    
	    WebElement deal = driver.findElement(By.linkText("Today's Deals"));
	    ac.contextClick(deal).perform();
	    
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    
	    WebElement electronics = driver.findElement(By.linkText("Electronics"));
	    ac.contextClick(electronics).perform();
	    
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	   
	    Set<String> windowHandles = driver.getWindowHandles();
	    System.out.println(windowHandles);
	    
	    for (String id : windowHandles) {
	    	String title = driver.switchTo().window(id).getTitle();
	    	System.out.println(title);
	    	}
	    String a="Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
	    for (String id : windowHandles) {
	    	if (driver.switchTo().window(id).getTitle().equals(a)) {
	    		break;
				
			}
			
		}
	}

}
