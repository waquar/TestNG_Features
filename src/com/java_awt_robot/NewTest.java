package com.java_awt_robot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
	
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", 
				"//Users//waquaralam//Automation_Addons/chromedriver");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.gmail.com/");	  
	  }
	
  @Test
  public void f() {
	  driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("waquaralam987");
	  driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	  driver.findElement(By.xpath(" //input[@name='password']")).sendKeys("password");;
	  driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	    
  }
    

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  
  }

}
