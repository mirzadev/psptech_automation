package attributesInTestAnnotations;

import org.testng.annotations.Test;

public class GroupNameAttribute {
	@Test(priority = 1, groups = "Smoke")
	private void print1() {
		System.out.println("private method");
	};
	@Test(groups = "Sanity")
	protected void print2() {
		System.out.println("protected method");
	};
	@Test(groups = "Sanity")
	void print3() {
		System.out.println("default method");
	};
	@Test(groups = "Somke", dependsOnGroups = "Smoke") 
	public void print4() {
		System.out.println("public method");		
	};
}
