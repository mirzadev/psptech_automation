package differentTypesOfAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAfterTest {
	@BeforeTest   // import the method
	public void login() {
		System.out.println("Login to the application");
	}
	@Test (priority=1)	
	public void TC_001() {
		System.out.println("Search the task");	
	}
	@Test (priority=2)
	public void TC_003() {
		System.out.println("Save all tasks");	
	}
	@AfterTest // import the method
	public void logout() {
		System.out.println("Logout from the task");
	}
}
class SecondTestClass{
	@Test (priority=3)
	public void TC_002() {
		System.out.println("Perform the task");
	}
}
