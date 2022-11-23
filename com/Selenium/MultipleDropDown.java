package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
  public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\billa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/dropdowns");
	WebElement superheros = driver.findElement(By.id("superheros"));
	Select a=new Select(superheros);
	a.selectByValue("am");
	a.selectByValue("aq");
	a.selectByValue("ta");
	a.selectByVisibleText("Batman");
	a.selectByVisibleText("Thor");
	a.selectByVisibleText("Ghost Rider");
	System.out.println(a.isMultiple());
	a.deselectByValue("ta");
	a.deselectByVisibleText("Batman");
	System.out.println(" ");
	
	List<WebElement> options = a.getOptions();
	for (WebElement alloptions : options) {
		System.out.println(alloptions.getText());
		}
	    System.out.println(" ");
		System.out.println("****************");
		
		
		List<WebElement> allSelectedOptions = a.getAllSelectedOptions();
		for (WebElement selectedoptions : allSelectedOptions) {
			System.out.println(selectedoptions.getText());
		}
		System.out.println("**************");
		WebElement firstSelectedOption = a.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		a.deselectAll();
		}
  }
