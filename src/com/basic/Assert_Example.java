package com.basic;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assert_Example {
	
	public WebDriver driver;

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "/Users/waquaralam/Automation_Addons/chromedriver");
	  driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.get("http://automationpractice.com/index.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
  
  @Test
  public void waq() throws InterruptedException {
	  
	  String title = driver.getTitle();
	  assertEquals(title, "My Store");
	  driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("DRESS");;
	  driver.findElement(By.name("submit_search")).click();
	  Thread.sleep(4000);
	  assertEquals(driver.getTitle(), "Search - My Store");
	  Actions builder = new Actions(driver);
	  WebElement target = driver.findElement(By.linkText("Printed Dress"));
	  Action myaction = builder.moveToElement(target).build();
	  myaction.perform();
	  driver.findElement(By.linkText("Add to cart")).click();  //failed here
	  Thread.sleep(4000);
	  Alert alert = driver.switchTo().alert();
	  String alerttext = alert.getText();
	  System.out.println(alerttext);
	  	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }
  
}
