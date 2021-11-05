package com.fbistech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reactivestreams.Subscriber;

import com.fbistech.base.TestBase;
import com.google.common.eventbus.Subscribe;

public class HomePage extends TestBase{
	WebElement userNameLabel;
	
//	Page Factory | Object Repository 
	
	
	@FindBy(xpath = "//div[@class='leftNavside']//a//*[local-name()='svg']") 
	@CacheLookup
	WebElement beamsityLogoLink;
	
	
	@FindBy(xpath = "//a[contains(text(),'Schools/Organizations')]") // "//a[contains(text(),'For Sponsors/Organization')]"
	@CacheLookup
	WebElement schools_OrganizationsLink;
	
	
	@FindBy(xpath = "//a[contains(text(),'Teach on BeamSity')]") 
	@CacheLookup
	WebElement techOnBeamsityLink;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")  //span[contains(text(),'Contact Us')] | //a[text()='Contact Us']
	@CacheLookup
	WebElement contactUsLink1;
	
	
	
	@FindBy(xpath = "//button[contains(.,'Contact us')]")
	@CacheLookup
	WebElement contactUsLink2;
	
	
	@FindBy(xpath = "//div[contains(text(),'Contact Us!')]")
	@CacheLookup
	WebElement contactUsText;
	
	
	
	@FindBy(xpath = "/a[contains(text(),'Sign In')]")  //a[normalize-space()='Login']
	@CacheLookup
	WebElement logInLink;
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Partner with us']")
	@CacheLookup
	WebElement partnerWithUsLink;
	
	
//  <----------------  GET STARTED  -------------------------->		
	
	
	@FindBy(xpath = "//button[@class='ant-btn started']") 
	@CacheLookup
	WebElement getStartedLink1;
	
	
	@FindBy(xpath = "//div[@class='sectionTwoGroup']//a")
	@CacheLookup
	WebElement getStartedLink2;
	
	@FindBy(xpath = "//div[@class='sectionFourGroup']//a")
	@CacheLookup
	WebElement getStartedLink3;
	
	
	
	
	
	@FindBy(xpath = "//span[contains(text(),'Learn More')]") 	//span[normalize-space()='Learn More']
	@CacheLookup
	WebElement learnMoreLink;
	

	
//  <----------------  COMPANY  -------------------------->	
	

	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	@CacheLookup
	WebElement aboutUsLink;

	
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	@CacheLookup
	WebElement privacyPolicyLink;
	
	
	

//  <----------------  CONTACT US  -------------------------->	
	
	@FindBy(xpath = "//a[contains(text(),'50, Awolowo Road Ikoyi lagos, Nigeria.')]")
	@CacheLookup
	WebElement  contactAddress;
	
	
	@FindBy(xpath = "//a[contains(text(),'info@beamsity.com')]")
	@CacheLookup
	WebElement  contactEmail;
	

	
//  <----------------  SIGN UP TO MAILING LIST  -------------------------->	
	
	
	@FindBy(xpath = "//input[@placeholder='Email Address']]")
	@CacheLookup
	WebElement mailingListEmailField;
	
	
	@FindBy(xpath = "//span[contains(text(),'Signup')]")
	@CacheLookup
	WebElement signUpMailingListButton;
	
	
//  <----------------  DOWNLOAD -------------------------->	
	
	@FindBy(xpath = "//button[@class='ant-btn']//*[local-name()='svg']")
	@CacheLookup
	WebElement googlePlayButton;
	
	
	
//------------------------------------------------------------------------		
	@FindBy(xpath = "//a[@class='ant-dropdown-trigger ant-dropdown-link']")
	@CacheLookup
	WebElement coursesLink; 
	
	
	@FindBy(xpath = "//a[contains(text(),'Subscribe')]")
	@CacheLookup
	WebElement subscribeLink; 
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Company')]")
	@CacheLookup
	WebElement companyLink;
	
	

	
	


	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	} 
	  
	
	
	public String verifyHomePageTitle() 
	{
		return driver.getTitle(); 
	}
	
	
	public boolean verifyUserNameOnHomePage()
	{
		
		return userNameLabel.isDisplayed();
	}
	
		

	
	public Schools_OrganizationsPage clickOnSchools_OrganizationsLink()
	{
		schools_OrganizationsLink.click();
		return new Schools_OrganizationsPage();
	}
	
	
	
	
	public TechOnBeamsityPage clickOnTechOnBeamsityLink()
	{
		techOnBeamsityLink.click();
		return new TechOnBeamsityPage();
	}
	
	
	
	
	public ContactUsPage clickOnContactUsLinks() throws Exception
	{
		contactUsLink1.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		contactUsLink2.click();
//		Thread.sleep(5000);
//		contactUsText.isDisplayed();
		return new ContactUsPage();
	}
	
	
	
	
	public LogInPage clickOnLogInLink()
	{
		logInLink.click();
		return new LogInPage();
	}
	  
	
	
	
	public PartnerWithUsPage clickOnPartnerWithUsLink()
	{
		partnerWithUsLink.click();
		return new PartnerWithUsPage();
	}
	
	
	
	
	
	public SponsorsPage clickOnGetStartedLinks()
	{
		 getStartedLink1.click();
		 getStartedLink2.click();
		 getStartedLink3.click();
		 
		 return new SponsorsPage();
	}
	
	
	
	
	
	public LearnMorePage clickOnLearnMoreLink()
	{
		learnMoreLink.click();
		
		return new LearnMorePage();
	}
	
	
	
	
	
	public AboutUsPage clickOnAboutUsLink()
	{
		aboutUsLink.click();
		return new AboutUsPage();
	}
	
	
	public Privacy_PolicyPage clickOnPrivacyPolicyLink()
	{
		 privacyPolicyLink.click();
		 return new Privacy_PolicyPage();
	}

	
	

	public HomePage clickOnContactAddress()
	{
		contactAddress.click();
		return new HomePage();
	}
	
	
	public HomePage clickOnContactEmail()
	{
		contactEmail.click();
		
		return new HomePage();
	}
	
	
	
	

	public HomePage clickOnMailingListEmailFiel()
	{
		mailingListEmailField.sendKeys("ayototootoo.com");;
		
		return new HomePage();
	}
	
	
	public HomePage clickOnSignUpMailingListButton()
	{
		signUpMailingListButton.click();
		
		return new HomePage();
	}
	
	
	
	
	

	public HomePage clickOnGooglePlayButton()
	{
		googlePlayButton.click();
		
		return new HomePage();
	}
	
	
	
	
	
	
	
	
//..................................................................
	
	public CoursesPage clickOnCoursesLink()
	{
		coursesLink.click();
		return new CoursesPage();
	}
	
	public SubscribePage clickOnSubscribeLink()
	{
		subscribeLink.click();
		return new SubscribePage();
	}

	
	public CompanyPage clickOnCompanyLink()
	{
		companyLink.click();
		return new CompanyPage();
	}
	
	
	public Sponsors_OrganizationPage clickOnSponsors_OrganizationLink()
	{
		schools_OrganizationsLink.click();
		return new Sponsors_OrganizationPage();
	}
	

	
	
	 

	
}
