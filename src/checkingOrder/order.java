package checkingOrder;

import org.testng.annotations.Test;

public class order {
	
	@Test(priority=3)
	void setUp() {
		System.out.println("I am the test 1");
	}
	

	@Test(priority=2)
	void login() {
		System.out.println("I am the test 2");
	}
	

	@Test(priority=1)
	void tearDown() {
		System.out.println("I am the test 3");
	}
}
	
