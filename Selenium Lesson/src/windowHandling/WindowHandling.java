package windowHandling;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();

		// Open new window by clicking the button
       driver.findElement(By.id("windowButton")).click();
	
     // Click on the new window element and read the text displayed on the window
     //   WebElement text = driver.findElement(By.id("sampleHeading"));
	
     // Fetching the text using method and printing it     
//        System.out.println("Element found using text: " + text.getText());
//        driver.quit();
	
        
      //Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();      
        // To get the parent window id
        System.out.println("Parent Window Id: " + mainWindowHandle);
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("Child Window Id: " + ChildWindow);
                System.out.println("Heading of child window is " + text.getText());
                
         //Now there will be two window to handle
                // To See both the two window ID
        		Set<String> multipleWindows = driver.getWindowHandles(); // import Set from java.util
        		for(String windows: multipleWindows) {
        			System.out.println(windows);  
        		}
        		// To return to parent window
        		driver.switchTo().window(mainWindowHandle);
        		// To Quit
        		driver.quit();
        		
        		
        		}
        	}
        }       
	}


