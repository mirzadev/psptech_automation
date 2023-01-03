package enableDisplayedSelected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();		
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().window().maximize(); 
		// If some fields are enables or not to check 	
			boolean isEnabled = driver.findElement(By.id("tb2")).isEnabled();
				System.out.println(isEnabled);

	}

}
