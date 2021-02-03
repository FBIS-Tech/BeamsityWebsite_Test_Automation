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
	
	@FindBy(xpath = "//a[@class='ant-dropdown-trigger ant-dropdown-link']")
	@CacheLookup
	WebElement coursesLink; 
	
	
	@FindBy(xpath = "//a[contains(text(),'Subscribe')]")
	@CacheLookup
	WebElement subscribeLink; 
	
	
	@FindBy(xpath = "//a[contains(text(),'For Sponsors/Organization')]")
	@CacheLookup
	WebElement sponsors_OrganizationLink;
	
	
	@FindBy(xpath = "//a[contains(text(),'Company')]")
	@CacheLookup
	WebElement companyLink;
	
	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	@CacheLookup
	WebElement LogInLink;
	
	@FindBy(xpath = "//span[contains(text(),'Contact Us')]")
	@CacheLookup
	WebElement contactUsLink;
	
	


	
	
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
	
	
	public Sponsors_OrganizationPage clickOnSponsors_OrganizationLink()
	{
		sponsors_OrganizationLink.click();
		return new Sponsors_OrganizationPage();
	}
	
	
	public CompanyPage clickOnCompanyLink()
	{
		companyLink.click();
		return new CompanyPage();
	}
	
	
	public LogInPage clickOnLogInLink()
	{
		LogInLink.click();
		return new LogInPage();
	}
	  
	public ContactUsPage clickOnContactUsLink()
	{
		contactUsLink.click();
		return new ContactUsPage();
	}
	
	
	 

	
}
