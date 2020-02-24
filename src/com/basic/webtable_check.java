package com.basic;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable_check extends Filewriter{
	
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver",  "/Users/waquaralam/Automation_Addons/chromedriver"); 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	List <WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']//tr"));
	
	for(WebElement row: rows){		
	    //Access a single row at a time and work on it
	    List<WebElement> cols = row.findElements(By.tagName("td"));	    
	            //Access each element of the List by using an index, starting from 0	    
	            String countryName = cols.get(1).getText();
	           /* System.out.print("Country: " + cols.get(1).getText() + " , ");
	            System.out.print("Capital: " + cols.get(2).getText() + " , ");
	            System.out.print("Currency: " + cols.get(3).getText() + " , ");
	            System.out.println("Languages: " + cols.get(4).getText() + " , ");*/
	            System.out.println(countryName); 	            
	    if(countryName.equals("United States")){
	        //This is the country we want to work with
	        //Click the checkbox
	        WebElement checkbox = cols.get(0).findElement(By.className("hasVisited"));
	        checkbox.click();
	        //Exit from the loop
	        break;
	    }
	}

	driver.quit();
}
}
