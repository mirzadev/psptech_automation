package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SingleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		// To handle the main / current / parent window
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window is : " + parentWindow );
		
		// To click on the Button 1 window - find web element and click
		driver.findElement(By.id("newWindowBtn")).click();
		
		//Now there will be two window to handle
		
		Set<String>miltipleWindows = driver.getWindowHandles();
		for (String windows: miltipleWindows) {
			System.out.println(windows);
			Thread.sleep(5000);
		}
	
		/*	
		
		
		
		Set<String> multipleWindows = driver.getWindowHandles(); // import Set from java.util
		for(String windows: multipleWindows) {
			System.out.println(windows);
			Thread.sleep(5000);
			driver.quit();
		*/
		}		
	}

