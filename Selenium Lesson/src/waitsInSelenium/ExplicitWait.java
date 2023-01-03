package waitsInSelenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com.au");	
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("(//a[@href='https://www.ebay.com.au/b/Electronics/bn_7000259947'])[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Will wait for total 20 Second to find the page then display error
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.ebay.com.au/b/Cameras/625/bn_1843441']"))).click();	
	}
}	