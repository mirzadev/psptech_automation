package framesInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToIframeByIndex {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
 		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-tree.html"); 
		driver.manage().window().maximize(); 
		
		
		// Switching to Frames by Index
		driver.switchTo().frame(0);		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/chrome/package-frame.html']")).click();
	 
	}

}
