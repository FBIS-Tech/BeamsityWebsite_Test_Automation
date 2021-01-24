package com.fbistech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fbistech.base.TestBase;

public class LoginPage extends TestBase{
	
//	PageFactory - Object Repository 
	
	@FindBy(xpath = "//input[@placeholder='Email/Phone number']") 
	@CacheLookup
	WebElement emailPhoneNo;

	@FindBy(xpath = "//input[@placeholder='Password']") 
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "//button[@type='button']") 
	@CacheLookup
	WebElement loginBtn;
	
	
	@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]") 
	@CacheLookup
	WebElement forgotPwd;
	
	// Create Free Account from Sign In Page
	@FindBy(xpath = "//a[contains(text(),'Create a free account')]") 
	@CacheLookup
	WebElement createFreeAcct; 
	 
	

	
	// Initializing the Page Objects/object repository:
	// how to initialize the element with the help of page factory 
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	

	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public void validateForgotPassword()
	{
		forgotPwd.click(); 
	}
	
	
	public LoginPage validateCreateFreeAcct()
	{
		createFreeAcct.click();
		return new LoginPage();
	}
	
	public HomePage loginDetails(String emailMobileNo, String pwd)
	{
		
		emailPhoneNo.sendKeys(emailMobileNo);		
		password.sendKeys(pwd);		
		loginBtn.click(); 
		
		
		//After login the method should return HomePage
		return new HomePage();
	}

	
}
