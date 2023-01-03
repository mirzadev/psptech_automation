package waitsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");	
		driver.manage().window().maximize();
		
		// Adding implicit wait
		// Depreciation: Capabilities objects are now replaced with Options, and we need to create an Options object to use the Driver class.
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//it will provide the waiting for the all the webElements present on the webpage
		driver.findElement(By.name("firstName")).sendKeys("Selenium");
		driver.findElement(By.name("lastName")).sendKeys("Java");
		driver.findElement(By.name("phon")).sendKeys("89898989"); // name=phon is wrong
		driver.findElement(By.name("userName")).sendKeys("awal@gmail.com");
		
		// Expected to fail, wait for 30 sec and throw error.
	}
}
