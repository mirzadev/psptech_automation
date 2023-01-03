package waitsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");	
		driver.manage().window().maximize();
		driver.findElement(By.name("firstName")).sendKeys("Selenium");
		Thread.sleep(5000);
		driver.findElement(By.name("lastName")).sendKeys("Java");
		Thread.sleep(5000);
		driver.findElement(By.name("phone")).sendKeys("89898989");
	}
}
