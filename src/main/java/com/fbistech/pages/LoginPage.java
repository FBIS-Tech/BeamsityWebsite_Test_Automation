package com.fbistech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fbistech.base.TestBase;

public class LogInPage extends TestBase{
	
//	PageFactory - Object Repository 
	
	@FindBy(xpath = "//input[@placeholder='Email/Phone number']") 
	@CacheLookup
	WebElement emailPhoneNo;

	@FindBy(xpath = "//input[@placeholder='Password']") 
	@CacheLookup
	WebElement passWord;
	
	@FindBy(xpath = "//button[@type='button']") 
	@CacheLookup
	WebElement loginBtn;
	
	
	@FindBy(xpath = " //a[contains(text(),'Forgot your password?')]")
	@CacheLookup
	WebElement forgotPwd;
	
	
	@FindBy(xpath = "//input [@placeholder='Enter email']") 
	@CacheLookup
	WebElement forgotPwdEmail;
	
	
	@FindBy(xpath = "//button[contains(text(),'Continue')]") 
	@CacheLookup
	WebElement forgotPwdEmailSubmitBtn;
	 
	
	
	// Create Free Account from Sign In Page
	@FindBy(xpath = "//a[contains(text(),'Create a free account')]") 
	@CacheLookup
	WebElement createFreeAcct; 
	 
	

	
	// Initializing the Page Objects | object repository:
	// how to initialize the element with the help of page factory 
	public LogInPage()
	{
		PageFactory.initElements(driver, this);
	}
	

	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	
	public HomePage loginDetails(String phoneNo, String password)
	{
		
		emailPhoneNo.sendKeys(phoneNo);		
		passWord.sendKeys(password);		
		loginBtn.click(); 
		
		//After login the method should return HomePage
		return new HomePage();
	}
	
	
	public LogInPage validateForgotPasswordLink()
	{
		forgotPwd.click();
		return new LogInPage(); 
	}
	

	
	public LogInPage forgetPasswordEmail(String passwordEmail) throws Exception
	{
		Thread.sleep(2000);
		forgotPwdEmail.sendKeys(passwordEmail);
		Thread.sleep(3000);
		forgotPwdEmailSubmitBtn.click();
		return new LogInPage();
	}
	
	

	
	public SignUpPage validateCreateFreeAcctLink()
	{
		createFreeAcct.click();
		return new SignUpPage();
	}

	
}
