package com.basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Running_Methods {
	 @Test
	  public void f() {
		 System.out.println("method");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Hi 1");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("Hi 2");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Hi 3");
	  }
	  
	  @Test
	  public void waq() {
		  System.out.println("hero");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("Hi 4");
	  }
}
