package com.accenttechpartners.telocure.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.accenttechpartners.telocure.baseClass.baseClass;

public class CommonMethods extends baseClass{

	public CommonMethods(WebDriver driver) {
		super(driver);
	}

	public static WebDriverWait wait;
	public static WebElement wElement;
	
	public static WebElement elementToVisible(WebElement ele, WebDriver driver) {
		wait = new WebDriverWait(getDriver(), 30);
		wElement = wait.until(ExpectedConditions.visibilityOf(ele));
		return wElement;
	}
	//logger.info("SendKeys reusable method is declared here");
	public static boolean sendData (WebElement ele, WebDriver driver, String data) {
		elementToVisible(ele, driver);
		if (ele == null) {
			return false;
		}else {
			ele.sendKeys(data);
			return true;
		}
	}

	// for sendKeys method 
	public static boolean click(WebElement ele, WebDriver driver) {
		elementToVisible(ele, getDriver());
		if (ele == null) {
		logger.info("Element is not Visible");	
		}else {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		}
		return true;
	}
	
	// For Alert handling
	
	public static boolean alert (WebElement ele, WebDriver driver) {
		if (ele == null) {
			logger.info("Element is not Visible");		
			return false;
		}else {
			ele.click();
		return true;
		}
	}
	
	public static void getTitle(WebDriver driver, String expectedTitle) {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		}
	public static void closeBrowser() {
		driver.close();
	}
}
