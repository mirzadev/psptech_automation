package differentTypesOfAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class AllAnnotations {
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Execution of beforeSuite method");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Execution of beforeTest method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Execution of beforeClass method");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Execution of beforeMethod method");
	}
	@Test (priority=1)	
	public void TC_001() {
		System.out.println("Search the task");	
	}
	@Test (priority=2)
	public void TC_003() {
		System.out.println("Save all tasks");	
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Execution of afterMethod method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Execution of afterClass method");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Execution of beforeTest method");
	}
	@AfterSuite
	public void afterSuit() {
		System.out.println("Execution of beforeSuite method");
	}
}
