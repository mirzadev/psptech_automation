package com.accenttechpartners.telocure.browseFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import com.accenttechpartners.telocure.baseClass.baseClass;
import com.accenttechpartners.telocure.utilities.ConfigReader;

public class browseFactory extends baseClass{

	static ConfigReader cf = PageFactory.initElements(driver, ConfigReader.class); 
	public browseFactory(WebDriver driver) {
		super(driver);
		
	}

	
public static WebDriver initiateBrowser() {
	driver = baseClass.getDriver();
	if(cf.getTestData("browser").equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe" );
	driver = new ChromeDriver();
	}
	else if(cf.getTestData("browser").equalsIgnoreCase("IE")) {
		System.setProperty("webdriver.ie.driver", ".\\src\\test\\resources\\Drivers\\IEdriverServer.exe" );
	driver = new InternetExplorerDriver();
	}
	else if(cf.getTestData("browser").equalsIgnoreCase("fireFox")) {
		System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\Drivers\\geckodriver.exe" );
	driver = new FirefoxDriver();
	}
	else if(cf.getTestData("browser").equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\drivers\\msedgedriver.exe" );
	driver = new EdgeDriver();
	}else {
		System.out.println("Invalid Browser Selected");
	}
	
	driver.get(cf.getTestData("URL"));
	driver.get(cf.getTestData("PatientURL"));
	driver.get(cf.getTestData("DoctorURL"));
	driver.get(cf.getTestData("HospitalURL"));
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(cf.getTestData("PatientMobile"));
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(cf.getTestData("PatientPassword"));
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	driver.findElement(By.xpath("//input[@name='common']")).sendKeys(cf.getTestData("DoctorMobile"));
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(cf.getTestData("DoctorPassword"));
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(cf.getTestData("HospitalEmail"));
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(cf.getTestData("HospitalPassword"));
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	return driver;
	

}



}
