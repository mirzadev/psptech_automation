package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmatoryAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");	
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();  // xpath by text()
		
//To handle this alert we need to use Alert interface. This need to import
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);  // this time gap is added just to show the alert handling
		alert.accept(); // It will click on OK and handle the alert

	}

}
