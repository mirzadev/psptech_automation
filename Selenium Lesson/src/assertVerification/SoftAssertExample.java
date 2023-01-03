package assertVerification;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	@Test
	public void test_001() {
	SoftAssert sa = new SoftAssert(); // import soft Assert class
	sa.assertEquals("Gmail", "gmail");	
	System.out.println("Test Execution got failed for TC_001");
	sa.assertAll();
	}
	@Test
	public void test_002() {
	Assert.assertEquals("Facebook", "Facebook");
	System.out.println("Test Execution got passed for TC_002");
	}
	@Test
	public void test_003() {
	Assert.assertEquals("Yahoo", "Yahoo");
	System.out.println("Test Execution got passed for TC_003");
	}


}
