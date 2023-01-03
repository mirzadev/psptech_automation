package screenShotsInSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShotInSelenium {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com.au");	
		driver.manage().window().maximize();
		
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
		// To save screen shots we need to add commons io dependencies to the project.
		FileUtils.copyFile(screenShotFile, new File(".\\screenshot.towhid.png")); // import FileUtils from commons io
		// After running this - screenshot folder will be generated and screen shot will be there. Refresh will get that
		driver.quit();
	}
}
