package javaScriptExecutor;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExecuteAsynScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Creating the JavascriptExecutor interface object by Type casting
		JavascriptExecutor js = (JavascriptExecutor)driver; // import Javascript Executor
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//Set the Script Timeout to 10 seconds
		js.executeAsyncScript("window.setTimeout(function(){alert('Hello UNITECH');},5000);alert('Hello PSP');");

	}

}
