package framesInSelenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toKnowThePresenceOfTheIframe {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
 		driver.get("https://www.jegsworks.com/lessons/web/basics/step-save-framed.htm");  
		driver.manage().window().maximize(); 

		//Size of the Frames
		
		List <WebElement> frames = driver.findElements(By.tagName("frame"));
		System.out.println("Size of the frame is: " + frames.size());
		
		List <WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Size of the iframe is: " + iframes.size());
		
		/*
		 
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		
		System.out.println("Frame size is: " + frames.size());
		
		//Size of the iframe
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		
		System.out.println("IFrame size is: " + iframes.size());
*/
	}

}
