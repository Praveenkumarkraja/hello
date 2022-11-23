package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\billa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		button.click();
		Thread.sleep(4000);
		WebElement FirstName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		FirstName.sendKeys("Praveen");
		WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		surname.sendKeys("Kumar");
		WebElement mobileno = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobileno.sendKeys("9874561230");
		WebElement newpass = driver.findElement(By.id("password_step_input"));
		newpass.sendKeys("Priya");
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select a=new Select(day);
		a.selectByValue("21");
		WebElement month = driver.findElement(By.id("month"));
		Select a1=new Select(month);
		a1.selectByIndex(6);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select a2=new Select(year);
		a2.selectByVisibleText("1998");
		WebElement male = driver.findElement(By.xpath("//label[text()='Male']"));
		male.click();
		WebElement signup = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		signup.click();
		
		
	}

}
