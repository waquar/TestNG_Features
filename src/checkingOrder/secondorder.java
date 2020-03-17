package checkingOrder;

import org.testng.annotations.Test;

public class secondorder {
	
	@Test(priority=4)
	void newsetUp() {
		System.out.println("I am the test 4");
	}
	

	@Test(priority=5)
	void newlogin() {
		System.out.println("I am the test 5");
	}
	

	@Test(priority=6)
	void newtearDown() {
		System.out.println("I am the test 6");
	}

}
