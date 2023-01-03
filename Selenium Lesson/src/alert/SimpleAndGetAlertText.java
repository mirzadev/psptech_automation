package alert;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAndGetAlertText {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.xpath("//*[text()='Click Me']")).click();  // xpath by text()
		
		Thread.sleep(5000);
		Alert alert =driver.switchTo().alert();
		//nandini.accept();
		//alert.dismiss();
		
		
		//To handle this alert we need to use Alert interface. This need to import
		 	
		alert.getText();
		String alertText = alert.getText(); // to see the alert text
		System.out.println(alertText);

	}

}
