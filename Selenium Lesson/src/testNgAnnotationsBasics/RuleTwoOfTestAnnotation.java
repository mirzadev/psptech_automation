package testNgAnnotationsBasics;

import org.testng.annotations.Test;

public class RuleTwoOfTestAnnotation {
	@Test
	private void print1() {
		System.out.println("private method");
	};
	@Test
	protected void print2() {
		System.out.println("protected method");
	};
	@Test
	void print3() {
		System.out.println("default method");
	};
	@Test
	public void print4() {
		System.out.println("public method");
	};
}
