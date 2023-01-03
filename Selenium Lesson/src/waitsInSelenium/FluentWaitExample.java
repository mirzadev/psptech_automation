package waitsInSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com.au");	
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("(//a[@href='https://www.ebay.com.au/b/Electronics/bn_7000259947'])[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30)) // Will wait for total 30 Seconds
				  .pollingEvery(Duration.ofSeconds(5)) // Will check every after 5 Seconds
				  .withMessage("PSP Tech element is not visible") // If I want any message to add also - once there are error
				  .ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='https://www.ebay.com.au/b/Cameras/629/bn_1843441']"))).click();
		// if you want to see error, put wrong locator

	}
}
