package differentTypesOfAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAndAfterSuite {
	@BeforeSuite   // import the method
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
	@AfterSuite // import the method
	public void logout() {
		System.out.println("Logout from the task");
	}
}
class TestClassB{	
	@Test ()
	public void TC_002() {
		System.out.println("Perform the task");
	}
}

