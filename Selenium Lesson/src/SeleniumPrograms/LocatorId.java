package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorId {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.manage().window().maximize();		
		Thread.sleep(5000);	
		driver.findElement(By.id("email")).sendKeys("mirza3512@yahoo.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("mirza1234");
		driver.findElement(By.id("u_0_5_zV")).click();
	}

}
