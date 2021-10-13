package com.fbistech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fbistech.base.TestBase;

public class LogInPage extends TestBase {

	
//	PageFactory - Object Repository 
	
	
//	 WemailPhoneNoField = driver.findElement(By.id("//input[@id='email']"));
	@FindBy(xpath= "//input[@id='email']")
//	@FindBy(xpath= "//input[@placeholder='Email/Phone number']")     
//	@CacheLookup
	WebElement emailPhoneNoField;
	
	
	@FindBy(xpath = "//*[@class='chakra-icon css-13otjrl']") 
	@CacheLookup
	WebElement showPasswordEye;
	

	@FindBy(xpath = "//input[@id='password']") 
	@CacheLookup
	WebElement passWordField;
	
	
	
	@FindBy(xpath = "//p[contains(text(),'Terms and Conditions')]")  //p[normalize-space()='Terms and Conditions'] 
	@CacheLookup
	WebElement term_ConditionsLink;
	
	
	
	@FindBy(xpath = "//button[@type='button']") //button[contains(text(),'Login')] //button[normalize-space()='Login']
	@CacheLookup
	WebElement loginButton;
	
	
	
	
	@FindBy(xpath = " //a[contains(text(),'Forgot your password?')]") 
	@CacheLookup
	WebElement forgotPassWordLink;
	
	
	
	@FindBy(xpath = "//input [@placeholder='Enter email']") 
	@CacheLookup
	WebElement forgotPwdEmailField;
	
	
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
		return driver.getTitle(); //this method should return title of the page 
	}
	
	
	
//	public HomePage validateUserLogin(String phoneNo, String password) throws Exception
	public HomePage validateUserLogin() throws Exception

	{
		emailPhoneNoField.sendKeys("nirsaladmin@beamsity.com");
//		Thread.sleep(2000); 
		showPasswordEye.click();
//		Thread.sleep(2000);
		passWordField.sendKeys("password");
//		Thread.sleep(2000);
		loginButton.click(); 
		
		//After login the method should return HomePage
		return new HomePage();
	}
	
	
	public LogInPage validateForgotPasswordLink()
	{
		forgotPassWordLink.click();
		return new LogInPage(); 
	}
	

	
	public LogInPage forgetPasswordEmail(String passwordEmail) throws Exception
	{
		Thread.sleep(2000);
		forgotPwdEmailField.sendKeys(passwordEmail);
		Thread.sleep(3000);
		forgotPwdEmailSubmitBtn.click();
		return new LogInPage();
	} 
	
	
	public LogInPage validateTermsAndConditionsLink()
	{
		term_ConditionsLink.click();
		return new LogInPage(); 
	}
	
	
	public SignUpPage validateCreateFreeAcctLink()
	{
		createFreeAcct.click();
		return new SignUpPage();
	}

	
}
