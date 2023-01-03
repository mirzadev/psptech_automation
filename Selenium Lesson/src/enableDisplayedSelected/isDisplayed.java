package enableDisplayedSelected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();		
		driver.get("https://wordpress.com/log-in");
		driver.manage().window().maximize(); 
		// If some fields are displayed or not to check 	
			boolean isDisplayed = driver.findElement(By.id("usernameOrEmail")).isDisplayed();
				System.out.println(isDisplayed);

	}

}
