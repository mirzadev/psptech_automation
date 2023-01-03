package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement test = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions db = new Actions(driver);
		db.doubleClick(test).build().perform();
	
//		Actions myTask = new Actions(driver);
//		myTask.doubleClick(test).build().perform();

	}

}
