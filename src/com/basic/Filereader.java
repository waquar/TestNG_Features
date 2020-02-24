package com.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filereader {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver",  "/Users/waquaralam/Automation_Addons/chromedriver");
		//WebDriver driver = new ChromeDriver();
		String datalocation = "/Users/waquaralam/Automation_Addons/links.txt";
		
		try {
			FileReader fr = new FileReader(datalocation);
			BufferedReader br = new BufferedReader(fr);
			String linetext = null;
			while ((linetext = br.readLine()) != null ) {
				//driver.get(linetext);
				System.out.println(linetext);
				//System.out.println(driver.getTitle());
			}
			//driver.close();
			br.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

