package assertVerification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
		WebDriver driver;
	
		 @Parameters({"browser"})  // Run not on Test file but right click on testng.xml file and run as test suit.
		 @Test(priority=1)
		 public void launchUrlTest(String browser) {
			 System.out.println("Running browser is: " + browser);
			 
			 if(browser.equals("chrome")) {
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
				 driver = new ChromeDriver();
			 }
			 else if (browser.equals("firefox")) {
				 driver = new FirefoxDriver();
			 }
			 else if(browser.equals("ie")) {
				 driver = new InternetExplorerDriver();
			 }
			 else {
				 driver = new EdgeDriver();
			 }
			  driver.get("https://ui.freecrm.com/");
		 }
		 
		 @Parameters({"email", "password"})
		 @Test(priority=2)
		 public void LoginTest(String email, String password) {
			 driver.findElement(By.name("email")).sendKeys(email);;
			 driver.findElement(By.name("password")).sendKeys(password);
			 driver.findElement(By.xpath("//*[@ class='ui fluid large blue submit button']")).click();
			 System.out.println("My email used is: " + email + " and password is: " + password);			
		 }
}