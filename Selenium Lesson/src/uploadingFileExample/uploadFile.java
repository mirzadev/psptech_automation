package uploadingFileExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		// First identify the web Element for Browse button
		// then use sendkeys command. Put the path here.
		driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\awalm\\OneDrive\\Documents\\Mirza Resume\\Resume-of-Mirza-A-Awal.pdf");
		
		
		
		
		//driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\awalm\\OneDrive\\Documents\\Important Documents\\Mirza-Awal-Portfolio-Logo.png");
	}

}
