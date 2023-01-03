package com.accenttechpartners.telocure.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.accenttechpartners.telocure.baseClass.baseClass;

public class homePage extends baseClass{

	public homePage(WebDriver driver) {
		super(driver);
	}
@FindBy (xpath= "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
public WebElement ClickHome;

@FindBy (how = How.XPATH, using = "(//a[@class='nav-link'])[2]")
public WebElement PatientClick;

@FindBy (how = How.XPATH, using="(//a[@class='btn drop-btn'])[1]")
public WebElement PatientJoinNowClick;

@FindBy (how = How.XPATH, using="/html/body/main/div[1]/div/div/div[1]/div/div/div[2]/div/a/span")
public WebElement PatientSignInClick;

@FindBy (how = How.XPATH, using = "(//a[@href='https://www.telocuretest.com/service/doctor'])[1]")
public WebElement DoctorClick;

@FindBy (how = How.XPATH, using = "(//a[@class='btn drop-btn'])[1]")
public WebElement DoctorJoinNowClick;

@FindBy (how = How.XPATH, using = "(//a[@class='btn drop-btn'])[1]")
public WebElement DoctorSignInClick;

@FindBy (how = How.XPATH, using = "(//a[@class= 'nav-link'])[4]")
public WebElement HospitalClick;

@FindBy (how = How.XPATH, using = "(//a[@class='btn drop-btn'])[1]")
public WebElement HospitalJoinNowClick;

@FindBy (how = How.XPATH, using = "(//a[@class='btn drop-btn'])[1]")
public WebElement HospitalSignInClick;

@FindBy (how = How.XPATH, using = "(//a[@class='nav-link'])[5]")
public WebElement EPriscriptionClick;

@FindBy (how = How.CLASS_NAME, using = "nav-link")
public WebElement ContactUSClick;

@FindBy (how = How.CLASS_NAME, using = "nav-link")
public WebElement ContactUSbottomClick;

@FindBy (how = How.XPATH, using="//input[@id='name']")
public WebElement ContactNameInsert;

@FindBy (how = How.ID, using="email")
public WebElement ContactEmailInsert;

@FindBy (how = How.ID, using="phone_number")
public WebElement ContactPhoneInsert;

@FindBy(how = How.ID, using="msg_subject")
public WebElement ContactSubjectInsert;

@FindBy(how = How.ID, using="message")
public WebElement ContactMessageInsert;

@FindBy(how= How.CLASS_NAME, using = "btn btn-info")
public WebElement ContactSendClick;

@FindBy(how = How.XPATH, using = "/html/body/main/div[1]/div/div/div/ul/li[1]/a")
public WebElement ContactUsPageHomeButton;

@FindBy (how = How.XPATH, using = "/html/body/footer/div/div[3]/div[1]/div/div/ul/li[1]")
public WebElement ContactUSByEmailClick;

@FindBy (how = How.XPATH, using = "(//a[@href='tel:+8801743440907'])[1]")
public WebElement ContactUSByPhoneClick;

@FindBy (how = How.CLASS_NAME, using = "nav-link")
public WebElement TopAboutUsClick;

@FindBy (how = How.CLASS_NAME, using = "nav-link")
public WebElement BottomAboutClick;


@FindBy (how = How.XPATH, using = "(//a[@href='https://telocuretest.com/service/patient'])[4]")
public WebElement ProductServicesPatientClick;

@FindBy (how = How.XPATH, using = "//a[@href='https://telocuretest.com/register/patient']")
public WebElement ProductServicesPatientJoinNowClick;

@FindBy (how = How.XPATH, using = "//a[@href='https://telocuretest.com/login/patient']")
public WebElement ProductServicesPatientSignInClick;

@FindBy (how = How.XPATH, using = "(//a[@href='https://telocuretest.com/service/doctor'])[4]")
public WebElement ProductServicesDoctorClick;

@FindBy (how = How.XPATH, using = "//a[@href='https://telocuretest.com/register/doctor']")
public WebElement ProductServicesDoctorJoinNowClick;

@FindBy (how = How.XPATH, using = "//a[@href='https://telocuretest.com/login/doctor']")
public WebElement ProductServicesDoctorSignInClick;

@FindBy (how = How.XPATH, using = "(//a[@href='https://telocuretest.com/service/hospital'])[4]")
public WebElement ProductServicesHospitaClick;

@FindBy (how = How.XPATH, using = "//a[@href='#hospital-add']")
public WebElement ProductServicesHospitalJoinNowClick;

@FindBy (how = How.XPATH, using = "//a[@href='https://telocuretest.com/login/hospital']")
public WebElement ProductServicesHospitalSignInClick;

@FindBy (how = How.XPATH, using = "https://telocuretest.com/service/e-prescription")
public WebElement ProductServicesEPriscriptionClick;


@FindBy (how = How.XPATH, using = "//a[@href='https://telocure.com/loginarea']")
public WebElement QuickLinksMyAccountClick;

@FindBy (how = How.XPATH, using = "//a[@href='https://telocure.com/registerarea']")
public WebElement QuickLinksSignUpClick;

@FindBy (how = How.XPATH, using = "(//a[@href='https://telocuretest.com/help/faq'])[3]']")
public WebElement QuickLinksFAQClick;

@FindBy (how = How.XPATH, using = "(//a[@href='https://telocuretest.com/help/howitworks'])[3]")
public WebElement QuickLinksHowTelocureWorksClick;

@FindBy (how = How.XPATH, using = "(//a[@href='https://telocuretest.com/privacy'])[3]']")
public WebElement OtherPrivacyClick;

@FindBy (how = How.XPATH, using = "//a[@href='https://telocuretest.com/appsprivacy']")
public WebElement AppsPrivacyClick;

@FindBy (how = How.XPATH, using = "//a[@href='https://telocuretest.com/terms']")
public WebElement OtherTermsAndConditionsClick;

@FindBy (how = How.XPATH, using = "//a[@href='https://telocuretest.com/refund']")
public WebElement OtherPaymentAndRefundPolicyClick;

@FindBy (how = How.XPATH, using = "(//a[@href='https://telocuretest.com'])[5]")
public WebElement BottomHomeClick;








}
