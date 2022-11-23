package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
     public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\billa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://letcode.in/table");
	  System.out.println("--------ALL DATA---------");
	  List<WebElement> alldata = driver.findElements(By.xpath("(//table)[3]/tr/td"));
	  for (WebElement all : alldata) {
		  System.out.println(all.getText());
		
	}
	  System.out.println("");
	  System.out.println("---------ROW DATA----------");
	  List<WebElement> rowdata = driver.findElements(By.xpath("(//table)[3]/tr[4]/td"));
	  for (WebElement row : rowdata) {
		  System.out.println(row.getText());
		
	}
	  System.out.println("");
	  System.out.println("---------COLUMN DATA---------");
	  List<WebElement> columndata = driver.findElements(By.xpath("(//table)[3]/tr/td[3]"));
	  for (WebElement column : columndata) {
		  System.out.println(column.getText());
		 
		
	}
	  
	  
	  
	  
}
}
