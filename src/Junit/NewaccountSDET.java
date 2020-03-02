package Junit;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(value = Parameterized.class)
public class NewaccountSDET {
	String name,email,phone,gender,password,country;
	boolean weeklyEmail, monthlyEmail, occasionalEmail;
	WebDriver driver;
	
	public void newAccountSDET() {
		WebElement name = driver.findElement(By.xpath("//input[@id='MainContent_txtFirstName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='//input[@id='MainContent_txtEmail']']"));
		WebElement phone = driver.findElement(By.xpath("//input[@id='MainContent_txtHomePhone']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='MainContent_txtPassword']"));
		WebElement verifyPassword = driver.findElement(By.xpath("//input[@id='MainContent_txtVerifyPassword']"));
		WebElement submit = driver.findElement(By.xpath("//input[@id='MainContent_btnSubmit']"));
		
	}
	
	@Test
	public void runtest() {
		
	}
	

	@Before
	public void setUp() {
		com.basic.Driverfactory.open("chrome");
		driver.get("http://sdettraining.com/trguitransactions/NewAccount.aspx");
				
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	public static List<String[]> getdata(){
		return Utilities.CSV.get("/Users/waquaralam/Desktop/UserAccounts.csv");
	}
	
	

}
