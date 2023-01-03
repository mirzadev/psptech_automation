package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintParticularRowColumns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		
		// To print particular row-column data
		
		
			String text1 = driver.findElement(By.xpath("//table[@class='dataTable']//tr[3]//td[4]")).getText();
			System.out.println("Text for the column is: " + text1);
			
		// To print particular full coulmn
		
			List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
			for(int i = 0; i<rows.size(); i++) {
				String text = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+(i+1)+"]//td[4]")).getText(); // just concatinate tr[2]
				//System.out.println("Text for the column is: " + text);
			// to print any particular value like 624.35
			if (text.contentEquals("624.35")) {
				System.out.println("Text present in this row is: " + text);
				break;
			}
			
			}		
	}
}

