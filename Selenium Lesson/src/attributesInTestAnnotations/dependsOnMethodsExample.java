package attributesInTestAnnotations;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethodsExample {
	@Test(priority = 1)
	private void print1() {
		System.out.println("private method");
		Assert.assertEquals(1, 2); // import Assert from org.testng.Assert
	};
	@Test()
	protected void print2() {
		System.out.println("protected method");
	};
	@Test(dependsOnMethods = {"print1", "print2"})
	void print3() {
		System.out.println("default method");
	};
	@Test(dependsOnMethods = {"print1"}) // if you want to run the test whether dependent fails or not use alwaysRun = true like attributes.
	public void print4() {
		System.out.println("public method");		
	};
}
