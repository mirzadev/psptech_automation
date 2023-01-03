package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\IEDriverServer.exe");
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\geckodriver.exe");
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\msedgedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
//		WebDriver driver1 = new InternetExplorerDriver();
//		WebDriver driver2 = new FirefoxDriver();
//		WebDriver driver3 = new EdgeDriver();
		
		
		// get method will return the URL of the browser
		
		driver.get("https://psptech.net/");
		
		// To maximize the window
		driver.manage().window().maximize();
		
		// To get the actual title of the page
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		// Insert your expected Expected Title
		
		String expectedTitle = "PSPTech – PSP Technology | Websites | Apps | Digital Solution";
		
		// In order to complete the verification if the web site is correctly displayed or not.
		
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test Case failed");
		}
		
		// if you want the current browser to close after opening
		
		driver.close();
		
		
	}

}
