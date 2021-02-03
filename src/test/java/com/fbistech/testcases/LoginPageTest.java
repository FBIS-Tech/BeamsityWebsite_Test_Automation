package com.fbistech.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.LogInPage;
import com.fbistech.util.JiraPolicy;

public class LoginPageTest extends TestBase{
	
	HomePage homePage;
	LogInPage logInPage;

	

	
	public LoginPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		 
		homePage = new HomePage();  
		logInPage = new LogInPage();

	}
	
	

	@JiraPolicy(logTicketReady=true)
	@Test(priority = 1)
	public void verifyLoginPageTitle()
	{
		logInPage = homePage.clickOnLogInLink();
		String title = logInPage.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "React App"); 
	}

	

	@JiraPolicy(logTicketReady=true)
	@Test(priority = 2)
	public void verifyUserCanClickLoginLink()
	{	
		logInPage = homePage.clickOnLogInLink();
	}
	
	@Test(priority = 3)
	public void verifyUserLoginWithValideDetails() throws Exception
	{
		logInPage = homePage.clickOnLogInLink();
		Thread.sleep(2000);
		homePage = logInPage.loginDetails(prop.getProperty("phoneNo"), prop.getProperty("password"));
		Thread.sleep(2000);

	}
	
	
	@Test(priority = 4)
	public void verifyUserCannotLoginWithInvalidEmail()
	{
		logInPage = homePage.clickOnLogInLink();
		homePage = logInPage.loginDetails(prop.getProperty("invalidPhoneNo"), prop.getProperty("password"));	
	}
	
	
	
	@Test(priority = 5)
	public void verifyUserCannotLoginWithInvalidPwd()
	{
		logInPage = homePage.clickOnLogInLink();
		homePage = logInPage.loginDetails(prop.getProperty("phoneNo"), prop.getProperty("invalidPassword"));	
	
	}
	
	
	
	@Test(priority = 6)
	public void verifyUserCanClickForgotPasswordLink()
	{
		logInPage = homePage.clickOnLogInLink();
		logInPage.validateForgotPasswordLink();    // require return type
	}
	
	

	@Test(priority = 7)
	public void verifyUserCanResetPassWord() throws Exception
	{
		logInPage = homePage.clickOnLogInLink();
		Thread.sleep(3000);
		logInPage = logInPage.validateForgotPasswordLink();
		logInPage = logInPage.forgetPasswordEmail(prop.getProperty("emailAddress"));
		
	}
	
	

	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(7000);
		driver.quit(); 
	}
	
	
}
