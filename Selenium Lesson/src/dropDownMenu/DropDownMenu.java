package dropDownMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();		
		driver.get("https://www.facebook.com/r.php?locale=en_US");
		driver.manage().window().maximize(); 
		
		// Declare instance variables
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		// Using Select method - Create an object. This need to be imported.		
		Select mo = new Select(month);
		Select dy = new Select(day);
		Select yr = new Select(year);
		
		// select the feature from the drop down list
		mo.selectByIndex(6);  // By Index value that starts from 0
		dy.selectByValue("15"); //By date value that can be string
		yr.selectByVisibleText("1980"); // By Visible Text
	
	}

}
