package com.accenttechpartners.telocure.testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.accenttechpartners.telocure.baseClass.baseClass;
import com.accenttechpartners.telocure.browseFactory.browseFactory;
import com.accenttechpartners.telocure.pages.homePage;
import com.accenttechpartners.telocure.utilities.CommonMethods;

public class HomePage_TS_001 extends baseClass{
	public HomePage_TS_001() {
		
		super(driver);
		}

	homePage homepage;
	
	@BeforeTest
	public void setUp() {
		driver = browseFactory.initiateBrowser();
		logger.info("Browser is getting initialized in Before Test");
		homepage = PageFactory.initElements(driver, homePage.class);
	}
	
	@Test
	public void TC_001_ClickHome() throws InterruptedException {
	System.out.println("Login into the test case");	
	logger.info("Test Case_001 execution has started");
	
	CommonMethods.getTitle(getDriver(), "TeloCuretest");
	CommonMethods.click(homepage.ClickHome, driver);
	}
	
	@Test
	public void TC_002_ClickPatient_JoinNow() throws InterruptedException {
		System.out.println("Click on Patient at Drop Down Menu of Top Line Product & Services Menu");
		logger.info("Test Case_002 execution has started");
	
	WebElement ele = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).build().perform();
	CommonMethods.getTitle(getDriver(), "TeloCuretest");
	CommonMethods.click(homepage.PatientClick, driver);
	CommonMethods.click(homepage.PatientJoinNowClick, driver);
	logger.info("Patient's Join Now button was clicked");
	}
	
	@Test
	public void TC_003_ClickPatient_Signin() throws InterruptedException {
	System.out.println("Click on Patient at Drop Down Menu of Top Line Product & Services Menu");
	logger.info("Test Case_003 execution has started");
	WebElement ele = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).build().perform();
	CommonMethods.click(homepage.PatientClick, driver);
	CommonMethods.click(homepage.PatientSignInClick, driver);
	logger.info("Patient's Sign in button was clicked");
	}
	
	@Test
	public void TC_004_ClickDoctor_JoinNow() {
		System.out.println("Click on Doctor at Drop Down Menu of Top Line Product & Services Menu");
		logger.info("Test Case_004 execution has started");
	
	WebElement ele = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).build().perform();
	CommonMethods.click(homepage.DoctorClick, driver);
	CommonMethods.click(homepage.DoctorJoinNowClick, driver);
	logger.info(" Doctor's Join Now button was clicked");
	}
	@Test
	public void TC_005_ClickDoctor_Signin() {
		logger.info("Test Case_005 execution has started");
	
	WebElement ele = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).build().perform();
	CommonMethods.click(homepage.DoctorClick, driver);
	CommonMethods.click(homepage.DoctorSignInClick, driver);
	logger.info("Doctor's Sign in button was clicked");
	}
	
	@Test
	public void TC_006_ClickHospital_JoinNow() {
		System.out.println("Click on Hospital at Drop Down Menu of Top Line Product & Services Menu");
		logger.info("Test Case_006 execution has started");
	
	WebElement ele = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).build().perform();
	CommonMethods.click(homepage.HospitalClick, driver);
	CommonMethods.click(homepage.HospitalJoinNowClick, driver);
	logger.info(" Hospital's Join Now button was clicked");
	}
	@Test
	public void TC_007_ClickHospital_Signin() {
		logger.info("Test Case_007 execution has started");
	
	WebElement ele = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).build().perform();
	CommonMethods.click(homepage.HospitalClick, driver);
	CommonMethods.click(homepage.HospitalSignInClick, driver);
	logger.info("Hospital's Sign in button was clicked");
	}
	
	@Test
	public void TC_008_ClickEPrescription() {
		logger.info("Test Case_008 execution has started");
	
	WebElement ele = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).build().perform();
	CommonMethods.click(homepage.EPriscriptionClick, driver);
	logger.info("E-Prescription button was clicked");
	}
	
	@Test
	public void TC_009_ClickContactUs() {
		logger.info("Test Case_009 execution has started");
	CommonMethods.click(homepage.ContactUSClick, driver);
	logger.info("Contact Us Button at top line menu bar was clicked");
	CommonMethods.sendData(homepage.ContactNameInsert, driver, "Mirza Awal- Testing");
	CommonMethods.sendData(homepage.ContactEmailInsert, driver, "awal3512@gmail.com");
	CommonMethods.sendData(homepage.ContactPhoneInsert, driver, "01712706157");
	CommonMethods.sendData(homepage.ContactSubjectInsert, driver, "Need Some Information");
	CommonMethods.sendData(homepage.ContactMessageInsert, driver, "This is testing team, doing testing");
	CommonMethods.click(homepage.ContactSendClick, driver);
	logger.info("Contact message has Been Send successfully" );
	}	
	
	@Test
	public void TC_010_ClickContactUsBottom() {
		logger.info("Test Case_010 execution has started");
	CommonMethods.click(homepage.ContactUSbottomClick, driver);
	logger.info("Contact Us Button at Bottom line menu bar was clicked");
	CommonMethods.sendData(homepage.ContactNameInsert, driver, "Mirza Awal- Testing");
	CommonMethods.sendData(homepage.ContactEmailInsert, driver, "awal3512@gmail.com");
	CommonMethods.sendData(homepage.ContactPhoneInsert, driver, "01712706157");
	CommonMethods.sendData(homepage.ContactSubjectInsert, driver, "Need Some Information");
	CommonMethods.sendData(homepage.ContactMessageInsert, driver, "This is testing team, doing testing for bottom line contact us button");
	CommonMethods.click(homepage.ContactSendClick, driver);
	logger.info("Contact message has Been Send successfully" );
	}	
	
	@Test
	public void TC_011_HomebuttonInContactUs() throws InterruptedException {
		logger.info("Test Case TC_011 execution has started");
	CommonMethods.click(homepage.ContactUSbottomClick, driver);
	CommonMethods.click(homepage.ContactUsPageHomeButton, driver);
	SoftAssert sa = new SoftAssert();
	sa.assertEquals("https://www.telocuretest.com/", "https://www.telocuretest.com/");
	}
	
	@Test
	public void TC_012_TopLineAboutUsButton() {
	logger.info("Test Case_012 execution has started");
	CommonMethods.click(homepage.TopAboutUsClick, driver);
	CommonMethods.click(homepage.BottomAboutClick, driver);
	logger.info("Both About us and About button has been Clicked");
	
		
	}
	@AfterTest
	public void tearDown() {
	logger.info("Testing for HomePage_TS_001 Completed");
	
}
}
