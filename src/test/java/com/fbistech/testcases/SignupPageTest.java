package com.fbistech.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.LoginPage;
import com.fbistech.pages.SignUpPage;

import junit.framework.Assert;

public class SignupPageTest extends TestBase {
	HomePage homePage;
	SignUpPage signupPage;
	LoginPage loginPage;

	
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
		signupPage = new SignUpPage();
		loginPage = new LoginPage();
	}

	
	@Test(priority=1)
	public void signUpPageTitleTest()
	{
		String title = signupPage.validateSignUpPageTitle();
		Assert.assertEquals(title, "Signup to Beamsity");  // No title page displayed from page source
	} 
	
	
	@Test(priority=1)
	public void verifySignUpLinkTest()
	{
		signupPage = homePage.clickOnSignUpLink();	
	}

	
	@Test(priority=2)
	public void verifySignUpTest()
	{
		signupPage = homePage.clickOnSignUpLink();
		homePage = signupPage.Signup(prop.getProperty("firstName"), prop.getProperty("lastName"), 
		prop.getProperty("phoneNo"), prop.getProperty("emailAddress"), prop.getProperty("password"));
	}	
	
	
	
	
//	@Test(priority=3)
//	public void verifyLoginLinkTest()
//	{
//		signupPage = homePage.clickOnSignUpLink();
//
//		loginPage = loginPage.clickOnLoginLink();	
//	
//	}
//	
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(4000);
		driver.quit();
	}
}
