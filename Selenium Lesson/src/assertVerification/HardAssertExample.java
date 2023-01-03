package assertVerification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
	@Test
	public void test_001() {
	Assert.assertEquals("Gmail", "gmail", "condition got failed");	
	System.out.println("Test Execution got passed for TC_001");
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
