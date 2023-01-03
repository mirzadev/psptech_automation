package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsMisc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html\r\n");
		driver.manage().window().maximize(); 
		
		// If some fields are enables or not to check 
		
		boolean isEnabled = driver.findElement(By.id("tb2")).isEnabled();
			System.out.println(isEnabled);
		// To Check if some fields are displayed or not
		boolean isDisplayed = driver.findElement(By.id("but2")).isDisplayed();
			System.out.println(isDisplayed);			
		// To check if the feature is selected or not
		boolean isSelected = driver.findElement(By.id("checkbox1")).isSelected();
			System.out.println(isSelected);	
	}
}
