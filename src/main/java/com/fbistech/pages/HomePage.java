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
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Contact Us']")  // "//span[contains(text(),'Contact Us')]"
	@CacheLookup
	WebElement contactUsLink;
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Login']") // "//a[contains(text(),'Sign In')]"
	@CacheLookup
	WebElement logInLink;
	
	
	@FindBy(xpath = "//a[normalize-space()='Partner with us']")
	@CacheLookup
	WebElement partnerWithUsLink;
	
	
	
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
	
	
	public ContactUsPage clickOnContactUsLink()
	{
		contactUsLink.click();
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
