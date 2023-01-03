package dropDownMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();		
		driver.get("https://www.facebook.com/r.php?locale=en_US");
		driver.manage().window().maximize(); 
		
		WebElement  monthList = driver.findElement(By.id("month"));
		Select ml = new Select(monthList);
		List<WebElement> allMonths = ml.getOptions();
		
		for (int i = 0; i < allMonths.size(); i++) {
			String value = allMonths.get(i).getText();
			System.out.println(value);
		}


	}

}
