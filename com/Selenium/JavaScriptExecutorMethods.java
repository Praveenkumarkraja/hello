package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorMethods {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\billa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?ie=UTF8&tag=googmantxtmob50-21&ascsubtag=_k_CjwKCAiA68ebBhB-EiwALVC-NhdiWQ9isgkMFenV37UaR0Hn2NmMio_ok0YOXFoRSwnxJfS2Rb4aYxoCj3sQAvD_BwE_k_&gclid=CjwKCAiA68ebBhB-EiwALVC-NhdiWQ9isgkMFenV37UaR0Hn2NmMio_ok0YOXFoRSwnxJfS2Rb4aYxoCj3sQAvD_BwE");
    WebElement poland = driver.findElement(By.linkText("Poland"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", poland);
	js.executeScript("window.scrollBy(0,-5500);");
	js.executeScript("window.scrollBy(0,5500);");
	
	
	
}
}
