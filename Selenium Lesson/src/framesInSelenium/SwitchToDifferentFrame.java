package framesInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToDifferentFrame {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
 		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-tree.html"); 
		driver.manage().window().maximize(); 
		
		// Switching to Frames by Index
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/bidi/log/package-frame.html']")).click();
		
		// To Switch back to main Frame
			
			// driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
		// Switching to another frame	
			driver.switchTo().frame(1);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@href='LogEntry.html']")).click();	

	}

}
