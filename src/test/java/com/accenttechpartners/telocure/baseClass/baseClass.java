package com.accenttechpartners.telocure.baseClass;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseClass {
	public static WebDriver driver = null;
	public static WebDriverWait wait;
	public static WebElement WElement;
	public static Logger logger;
 	
public baseClass(WebDriver driver) {
	baseClass.driver = driver;
}
public static WebDriver getDriver() {
	logger = Logger.getLogger("telehealth");
	PropertyConfigurator.configure("log4j.properties");
	
	if (driver == null) {
		return driver;
	}else {
	return driver;	
	}
	}
public void setDriver (WebDriver driver) {
	baseClass.driver = driver;
}
}
