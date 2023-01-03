package assertVerification;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersInTestNG implements ITestListener{ // Import ITestListener
	
	@Override
	public void onTestSuccess(ITestResult result) { // import ITestResult
	System.out.println("Test Case got success");	
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("Test Case got failed");	
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("Test Case got skipped");	
	}
	
	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("Test Case got started");	
	}	
}
