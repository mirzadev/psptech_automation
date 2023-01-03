package webTable;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTheSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
    // To find the total Number of Rows in the table
		//import List class and WebElement (the one has List element)
		List<WebElement> rows = driver.findElements(By.xpath("//*[@class='dataTable']//tr"));
		System.out.println("Number of rows in this table: " + rows.size() );
			
	// To find the total Number of columns in the table
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@class='dataTable']//tr[2000]//td"));
		System.out.println("Total Number of Columns in this table are: " + columns.size());	
	}
}
