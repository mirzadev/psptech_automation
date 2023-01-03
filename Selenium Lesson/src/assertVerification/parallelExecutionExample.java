package assertVerification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelExecutionExample {

	@Test
	public void TC_001() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//System.out.println("TC_001 : " + Thread.currentThread().getId());
	}
	@Test
	public void TC_002() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wordpress.com/");
		//System.out.println("TC_002 : " + Thread.currentThread().getId());
	}
	@Test
	public void TC_003() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://psptech.net/");
		//System.out.println("TC_003 : " + Thread.currentThread().getId());
	}
	@Test
	public void TC_004() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//System.out.println("TC_004 : " + Thread.currentThread().getId());
	}	
}
