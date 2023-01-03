package attributesInTestAnnotations;

import org.testng.annotations.Test;

public class PriorityInTestAndEnableOption {
	@Test(priority=2)
	public void TC_001() {
		System.out.println("Search the task");
	}
	@Test (priority=1, enabled = false)	// if you don't want to execute any TC
	public void TC_002() {
		System.out.println("Login to the application");	
	}
	@Test (priority=4)
	public void TC_003() {
		System.out.println("Save all tasks");
	}
	@Test (priority=3)
	public void TC_004() {
		System.out.println("Perform the task");	
	}
	@Test (priority=5)
	public void TC_005() {
		System.out.println("Logout from the task");
	}
	
}
