package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
				
		WebDriver driver  = new ChromeDriver();
		
		//get method to get the website using the link
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		driver.manage().window().maximize();  // to maximize the screen
		
		// To find the particular element and insert data there.
		
		
		driver.findElement(By.xpath("//a[@href='/start?user_email=']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("nandini@gmail.com");  // entering the Email address
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("Nandini");  // entering the Username
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("Nyclass#351");  // entering the Password
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();  // click on the Create your account button
	
	
	/*
	 // if you want to clear multiple task with the same web element use the reference key:
	  	WebElement ele = driver.findElement(By.id("email"));
	  			 ele.clear(); // to clear any existing data
	  			 ele.sendKeys("PSP Tech");
	  			 ele.click();
	 
	 
		
		// If some fields are enables or not to check 
		
		boolean isEnabled = driver.findElement(By.id("username")).isEnabled();
		System.out.println(isEnabled);
		// To Check if some fields are displayed or not
		boolean isDisplayed = driver.findElement(By.id("username")).isDisplayed();
		System.out.println(isDisplayed);
	*/
		
	
	}

}
