package differentTypesOfAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAndAfterClass {
	@BeforeClass   // import the method
	public void login() {
		System.out.println("Login to the application");
	}
	@Test ()	
	public void TC_001() {
		System.out.println("Search the task");	
	}
	@Test ()
	public void TC_003() {
		System.out.println("Save all tasks");	
	}
	@AfterClass // import the method
	public void logout() {
		System.out.println("Logout from the task");
	}
}
class SecondClass{
	@BeforeClass   // import the method
	public void login() {
		System.out.println("Second Class login");
	}
	@Test ()
	public void TC_002() {
		System.out.println("Perform the task");
	}
	@AfterClass // import the method
	public void logout() {
		System.out.println("Second Class Logout");
	}
}
