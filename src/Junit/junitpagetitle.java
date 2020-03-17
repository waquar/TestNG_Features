package Junit;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
import org.testng.annotations.Test;

class junitpagetitle {
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Test
	public void pagetitle() {
		String weburl = "http://www.sdettraining.com/contact.html";
		driver = com.basic.Driverfactory.open("chrome");
		driver.get(weburl);
		String Expectedtitle = "Welcome waquar";
		String Actualtitle= driver.getTitle();
		Assert.assertEquals(Expectedtitle, Actualtitle);
		System.out.println("what i will do!");
		
	}
	
	@Before
	public void setUp() {
		System.out.println("Lets Dance!!");
	}
	
	@After
	public void tearDown() {
		System.out.println("Dancing!");
		driver.close();
	}

}
