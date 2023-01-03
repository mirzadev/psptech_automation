package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScriptToClickAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// Print the title of the page
		String script = "return document.title;";
		String title = (String) js.executeScript(script);
		System.out.println(title);
		
		// Click the button
		driver.switchTo().frame("iframeResult");
		// Now instead of clicking on Tryit button using locator
			// I can use javaScript and simply call the function myFunction()
		js.executeScript("myFunction()");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
		
		
		

	}

}
