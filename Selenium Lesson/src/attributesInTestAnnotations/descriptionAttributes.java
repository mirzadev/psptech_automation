package attributesInTestAnnotations;

import org.testng.annotations.Test;

public class descriptionAttributes {
	@Test(priority = 1, description = "TestCase-1")
	private void print() {
		System.out.println("private method");
	};
	@Test(description = "TestCase-2")
	protected void print1() {
		System.out.println("protected method");
	};
	@Test(description = "TestCase-3")
	void print2() {
		System.out.println("default method");
	};
	@Test(description = "TestCase-4")
	public void print3() {
		System.out.println("public method");
	};
}
