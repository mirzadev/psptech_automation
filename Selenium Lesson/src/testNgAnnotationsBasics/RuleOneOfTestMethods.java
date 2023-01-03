package testNgAnnotationsBasics;

import org.testng.annotations.Test;

@Test
public class RuleOneOfTestMethods {
	private void print() {System.out.println("private method");};
	protected void print1() {System.out.println("protected method");};
	void print2() {System.out.println("default method");};
	public void print3() {System.out.println("public method");};	
}
