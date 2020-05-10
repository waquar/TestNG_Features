package Datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataprovider {
	
	
	
  @Test(dataProvider = "getdata")
  public void login(String name, String email, String password, String confirmpassword) throws InterruptedException {
	  
//	  System.setProperty("webdriver.chrome.driver", "/Users/waquaralam/Automation_Addons/chromedriver");
//	  WebDriver driver = new ChromeDriver();
//	  driver.get("https://learn.letskodeit.com/");
//	  
//	  Thread.sleep(4000);
//	  driver.findElement(By.xpath("//a[@id='header-sign-up-btn']")).click();
//	  Thread.sleep(4000);
//	  driver.findElement(By.xpath("input[@id='user_name']")).sendKeys(name);
//	  driver.findElement(By.xpath("input[@id='user_email']")).sendKeys(email);
//      driver.findElement(By.xpath("input[@id='user_password']")).sendKeys(password);
//      driver.findElement(By.xpath("input[@id='user_password_confirmation']")).sendKeys(confirmpassword);
//      Thread.sleep(2000);
      
      System.out.println(name + email+  password+ confirmpassword);
	   
  }
  
  @DataProvider
  public String[][] getdata(){
	  return Utilities.Excel.get("/Users/waquaralam/Desktop/emailexcel.xls");
	  
  }
  
}
