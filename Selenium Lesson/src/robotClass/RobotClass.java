package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// Cursor button will be on Email field
		//To press Enter button
		
		Robot rr = new Robot(); // import Robot Class
		rr.keyPress(KeyEvent.VK_ENTER); // import KeyEvent
		System.out.println("Enter button pressed");
		Thread.sleep(5000);
		rr.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Enter button released");
		Thread.sleep(5000);
		rr.keyPress(KeyEvent.VK_DOWN);
		System.out.println("Down button entered");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("mirza3512@yahoo.com");
		Thread.sleep(5000);
		rr.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		System.out.println("First Tab button pressed");
		rr.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		System.out.println("Second Tab button pressed");
		driver.findElement(By.id("pass")).sendKeys("password1234");
		Thread.sleep(5000);
		rr.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		System.out.println("Third time Tab button pressed");
		driver.findElement(By.id("loginbutton")).click();
	
	}
}
