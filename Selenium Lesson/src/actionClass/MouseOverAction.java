package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://psptech.net/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		WebElement ele = driver.findElement(By.xpath("(//a[@href='https://psptech.net/software-development/'])[1]"));	
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@href='https://psptech.net/software-development/app-development/'])[1]")).click();
		
	}

}
