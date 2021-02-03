package com.fbistech.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.LogInPage;
import com.fbistech.pages.School_OrganizationPage;
import com.fbistech.pages.SignUpPage;
import com.fbistech.util.JiraPolicy;

import junit.framework.Assert;

public class SignupPageTest extends TestBase {
	HomePage homePage;
	SignUpPage signUpPage;
	LogInPage logInPage;

	
	// this will initialize the properties of base class constructor there after call initialization() method
	public SignupPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homePage = new HomePage();
		signUpPage = new SignUpPage();
		logInPage = new LogInPage();
	}

	
	@JiraPolicy(logTicketReady=true)
	@Test(priority=1)
	public void verifyUserSignUpPageTitle() throws Exception
	{
		logInPage = homePage.clickOnLogInLink();
		Thread.sleep(2000);
		signUpPage = logInPage.validateCreateFreeAcctLink();
		Thread.sleep(2000);
		String title = signUpPage.validateSignUpPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "React App");  // No title page displayed from page source
	} 
	
	
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority=1) 
	public void verifyUserCanClickSignUpLink()
	{
		logInPage = homePage.clickOnLogInLink();
		signUpPage = logInPage.validateCreateFreeAcctLink();
	}


	@Test(priority=2)
	public void verifyUserCanSignUpForm() throws Exception
	{
		homePage.clickOnLogInLink();
		Thread.sleep(2000);
		signUpPage = logInPage.validateCreateFreeAcctLink();
		Thread.sleep(3000);
		logInPage = signUpPage.Signup(prop.getProperty("firstName"), prop.getProperty("lastName"), 
		prop.getProperty("phoneNo"), prop.getProperty("emailAddress"), prop.getProperty("password"));
	}	
	
//	@Test(priority=3)
//	public void verifyUserCanSuccessfullySignUP()
//	{
//		signUpPage = homePage.clickOnSignUpLink();
////		loginPage = loginPage.clickOnLoginLink();	
//	
//	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(4000);
		driver.quit();
	}
}
