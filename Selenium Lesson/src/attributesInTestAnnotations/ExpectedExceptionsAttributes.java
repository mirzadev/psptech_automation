package attributesInTestAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedExceptionsAttributes {	
	//@Test
	@Test(expectedExceptions = AssertionError.class)
	private void print1() {
		System.out.println("private method");
		Assert.assertEquals(1, 2); // import Assert from org.testng.Assert
	};
	@Test()
	protected void print2() {
		System.out.println("protected method");
	};
	@Test()
	void print3() {
		System.out.println("default method");
	};
	@Test()  
	public void print4() {
		System.out.println("public method");		
	};
}
