package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		/*	
		driver.navigate().to("https://www.google.com/");	
		Thread.sleep(5000);
		
		driver.navigate().back();  // will go back to facebook page
		Thread.sleep(5000);
		
		driver.navigate().forward(); // will move forward to google page
		Thread.sleep(5000);
		
		driver.navigate().refresh(); // will refresh the existing page	
	*/
	}
}
