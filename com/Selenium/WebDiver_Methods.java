package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDiver_Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\billa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	     
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
      // driver.get("https://www.instagram.com/accounts/login/");
       //driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwiWiOCg_pP7AhVBD3IKHdMNC2AYABAAGgJzZg&ohost=www.google.com&cid=CAESbOD2_UV-Qal3YjISVEty3jOcSA94jjdinLZsNDO6L5pWGhMellHGKdeK3WrMr9ZH3Yj_CZaXz_MYSOJNz6S7XreQH_3J7rf3FehxjjVzIj3gfkLCwSrMAUFBt495hsj5Vr4jUtHFOcGQa1bkQQ&sig=AOD64_38umXMZYQEAWTCoNvqx4EUjfeveg&q&adurl&ved=2ahUKEwi249ig_pP7AhXdSGwGHcntCMAQ0Qx6BAgHEAE");
     //  driver.navigate().to("https://web.whatsapp.com/");
       //driver.navigate().forward();
    //   driver.navigate().back();
       // System.out.println(driver.getTitle());    
       //System.out.println(driver.getCurrentUrl());
       
       //driver.navigate().refresh();
      //driver.close();
     // driver.quit();
	driver.get("https://www.flipkart.com/");
       WebElement button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
       button.click();
       WebElement text = driver.findElement(By.xpath("//h2[text()='Best of Electronics']"));
       System.out.println(text.getText());
       WebElement text1 = driver.findElement(By.xpath("//h2[contains(text(),'Shop')]"));
       System.out.println(text1.getText());
       
       
       
       
       
       
	}
	
}
