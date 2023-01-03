package com.unitech.psptech.testCases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.unitech.psptech.baseClass.BaseClass;
import com.unitech.psptech.browserFactory.BrowserFactory;
import com.unitech.psptech.pages.HomePage;
import com.unitech.psptech.utilities.CommonMethods;



public class HomePage_TS_001 extends BaseClass{
	public HomePage_TS_001() {
		
		super(driver);
		}

	HomePage homepage;
	
	@BeforeTest
	public void setUp() {
		driver = BrowserFactory.initiateBrowser();
		logger.info("Browser is getting initialized in Before Test");
		homepage = PageFactory.initElements(driver, HomePage.class);
		CommonMethods.maximizeBrowser();
	}
	
	@Test
	public void TC_001_ClickHeaderHomeButton() throws InterruptedException {
	System.out.println("Header Home Button Clicked ");	
	logger.info("Test Case_001 Clicking Home Button has started");
	
	CommonMethods.getTitle(getDriver(), "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
	CommonMethods.click(homepage.ClickHome, driver);
	}
/*	
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
*/	
	
	@AfterTest
	public void tearDown() {
	logger.info("Testing for HomePage_TS_001 Completed");
	
}
}
