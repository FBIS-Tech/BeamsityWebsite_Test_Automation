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
	
	
	@FindBy(xpath = "//a[contains(text(),'Subscribe')]")
	@CacheLookup
	WebElement subscribeLink; 
	
	
	@FindBy(xpath = "//a[contains(text(),'For Sponsors/Organization')]")
	@CacheLookup
	WebElement sponsorsLink;
	
	
	@FindBy(xpath = "//a[contains(text(),'Company')]")
	@CacheLookup
	WebElement companyLink;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	@CacheLookup
	WebElement signUpLink;
	
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
	
	
	public SignUpPage clickOnSignUpLink()
	{
		signUpLink.click();
		return new SignUpPage();
	}
	  
	public ContactUsPage clickOnContactUsLink()
	{
		contactUsLink.click();
		return new ContactUsPage();
	}
	
	public SponsorsPage clickOnSponsorsLink()
	{
		sponsorsLink.click();
		return new SponsorsPage();
	}
	 

	
}
