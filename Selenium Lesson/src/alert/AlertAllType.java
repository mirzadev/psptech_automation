package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAllType {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.xpath("//*[text()='Click Me']")).click();  // xpath by text()
		
		//To handle this alert we need to use Alert interface. This need to import
		Alert alert = driver.switchTo().alert();
		alert.accept(); // will accept the alert
//		alert.dismiss(); // will dismiss the alert
 		
		String alertText = alert.getText();
		System.out.println(alertText);
		
//		alert.getText();// will get the text present in the alert
// 				String alertText = alert.getText(); // to see the alert text
// 				System.out.println(alertText);
//		alert.sendKeys(""); // will insert text in the alert
		
//		Thread.sleep(5000);
		
		//driver.switchTo().defaultContent();
		
		//driver.findElement(By.xpath("//*[@id='RESULT_TextField-1']")).sendKeys("Michael"); // FirstName field by using index number

	}

}
