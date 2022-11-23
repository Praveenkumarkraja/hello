package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClearElement;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class Elements_nov5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\billa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D58490306106%26hvpone%3D%26hvptwo%3D%26hvadid%3D486457318205%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D4352053328312338003%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061919%26hvtargid%3Dkwd-298187295805%26hydadcr%3D5657_2175734%26gclid%3DCj0KCQjwk5ibBhDqARIsACzmgLRy9IwMCpCjHE0hzq-mUPo9FMPGfthLgMqzfFgUaf0URlErGHq3SSoaAjlgEALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	/*	WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("9597640637");
		//username.clear();
		System.out.println(username.isDisplayed());
		System.out.println(username.isEnabled());
		System.out.println(username.isSelected());	
		WebElement button = driver.findElement(By.id("continue"));
		button.click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("1234567");
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();*/
		//WebElement create = driver.findElement(By.partialLinkText("Create"));
		//create.click();
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("2584765");
		
		
		
		}

}
