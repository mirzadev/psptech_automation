package testNgAnnotationsBasics;

import org.testng.annotations.Test;

public class TestAnnotationRegular {
	
	// I will have to add JUnit 5 and TestNG Library to build path in the project 
			@Test  // import Test annotation from testNg annotations
			public void testCase_001() {
				System.out.println("This is first Test Case_001");
				
			}
	public static void main(String[] args) {		
	}
}
