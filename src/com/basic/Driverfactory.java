package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driverfactory {
	
	public static WebDriver open(String browserType) {
		if (browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/waquaralam/Automation_Addons/geckodriver");
			return new FirefoxDriver();
		}
		else if (browserType.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "/Users/waquaralam/Automation_Addons/IEDriverServerdriver");
			return new InternetExplorerDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", "/Users/waquaralam/Automation_Addons/chromedriver");
			return new ChromeDriver();
		}
		
	}

}
