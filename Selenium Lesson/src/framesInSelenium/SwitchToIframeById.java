package framesInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToIframeById {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
 		driver.get("http://demo.guru99.com/test/guru99home/");   

		driver.manage().window().maximize(); 

		// Switching to Frames by Id
		driver.switchTo().frame("a077aa5e"); 
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@href='http://www.guru99.com/live-selenium-project.html']")).click();
	}

}
