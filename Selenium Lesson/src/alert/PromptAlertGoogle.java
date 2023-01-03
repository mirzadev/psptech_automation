package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertGoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");	
				WebDriver driver  = new ChromeDriver();
				driver.get("https://demoqa.com/alerts");
				driver.manage().window().maximize(); 
				
				driver.findElement(By.xpath("//*[@id='promtButton']")).click();  // xpath by text()
				
		//To handle this alert we need to use Alert interface. This need to import
				Alert alert = driver.switchTo().alert();	
				alert.sendKeys("Towhid");
				
				Thread.sleep(5000);
				
				//alert.sendKeys("Michael");// will insert text in the alert
				alert.accept(); // Text entered in Chrome browser will not be visible. So once you accept the alert, it will handle
	}

}
