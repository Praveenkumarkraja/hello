package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\billa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Praveenkraja");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123456789");
		WebElement login = driver.findElement(By.id("login"));
	    login.click();
	    WebElement location = driver.findElement(By.id("location"));
	    Select a=new Select(location);
	    a.selectByVisibleText("Melbourne");
	    WebElement hotel = driver.findElement(By.id("hotels"));
	    Select a1=new Select(hotel);
	    a1.selectByIndex(3);
	    WebElement roomtype = driver.findElement(By.id("room_type"));
	    Select a2=new Select(roomtype);
	    a2.selectByIndex(4);
	    WebElement roomno  = driver.findElement(By.id("room_nos"));
	    Select a3=new Select(roomno);
	    a3.selectByVisibleText("1 - One");
	    WebElement InDate = driver.findElement(By.id("datepick_in"));
	    InDate.clear();
	    InDate.sendKeys("12/11/2022");
	    WebElement OutDate = driver.findElement(By.id("datepick_out"));
	    OutDate.clear();
	    OutDate.sendKeys("15/11/2022");
	    WebElement adult = driver.findElement(By.id("adult_room"));
	    Select a4=new Select(adult);
	    a4.selectByVisibleText("3 - Three");
	    WebElement child = driver.findElement(By.id("child_room"));
	    Select a5=new Select(child);
	    a5.selectByVisibleText("1 - One");
	    WebElement submit = driver.findElement(By.id("Submit"));
	    submit.click();
	    WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
	    radiobutton.click();
	    driver.findElement(By.id("continue")).click();
	    WebElement firstname = driver.findElement(By.id("first_name"));
	    firstname.sendKeys("Praveen");
	    WebElement lastname = driver.findElement(By.id("last_name"));
	    lastname.sendKeys("kumar");
	    WebElement address = driver.findElement(By.id("address"));
	    address.sendKeys("USILAMPATTI");
	    WebElement creditcard = driver.findElement(By.id("cc_num"));
	    creditcard.sendKeys("9632587418529635");
	    WebElement credittype = driver.findElement(By.id("cc_type"));
	    Select a6=new Select(credittype);
	    a6.selectByVisibleText("VISA");
	    WebElement month = driver.findElement(By.id("cc_exp_month"));
	    Select a7=new Select(month);
	    a7.selectByIndex(7);
	    WebElement year = driver.findElement(By.id("cc_exp_year"));
	    Select a8=new Select(year);
	    a8.selectByVisibleText("2022");
	    WebElement ccv = driver.findElement(By.id("cc_cvv"));
	    ccv.sendKeys("1234");
	    driver.findElement(By.id("book_now")).click();
	    
	    
	    
	    
	
	}

}
