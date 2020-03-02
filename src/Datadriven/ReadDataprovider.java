package Datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataprovider {
	
	
	
  @Test(dataProvider = "getdata")
  public void login(String name, String email, String password) throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "/Users/waquaralam/Automation_Addons/chromedriver");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://sdettraining.com/trguitransactions/NewAccount.aspx");
	  
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//input[@id='MainContent_txtFirstName']")).sendKeys(name);;
	  driver.findElement(By.xpath("//input[@id='//input[@id='MainContent_txtEmail']']")).sendKeys(email);;
      driver.findElement(By.xpath("//input[@id='MainContent_txtPassword']")).sendKeys(password);;
      System.out.println(driver.getTitle());
	   
  }
  @DataProvider
  public String[][] getdata(){
	  return Utilities.Excel.get("/Users/waquaralam/Desktop/original.xls");
	  
  }
  
}
