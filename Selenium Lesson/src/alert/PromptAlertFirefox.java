package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptAlertFirefox {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.gecko.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\geckodriver.exe");		
		 
		WebDriver driver  = new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.xpath("//*[@id='promtButton']")).click();  // xpath by text()
		
//To handle this alert we need to use Alert interface. This need to import
		Alert alert = driver.switchTo().alert();	
		 alert.sendKeys("Towhid");// will insert text in the alert
		Thread.sleep(10000);
		alert.accept();

	}

}
