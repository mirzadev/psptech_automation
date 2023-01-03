package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
	
		action.contextClick().build().perform();
		
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.id("email"));
		action.contextClick(ele).build().perform();
		
	//	action.contextClick().build().perform(); // To perform right click without locating any elements
		
		// if you want to perform right click on particular elements (email Name)
	/*	
		WebElement ele = driver.findElement(By.id("email"));
		
		action.contextClick(ele).build().perform();
	*/
	}

}
