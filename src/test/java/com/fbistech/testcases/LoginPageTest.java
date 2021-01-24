package com.fbistech.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.LoginPage;
import com.fbistech.pages.SignUpPage;

public class LoginPageTest extends TestBase{
	
	HomePage homePage;
	SignUpPage signupPage;
	LoginPage loginPage;

	

	
	public LoginPageTest()
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
	
	
	@Test(priority = 1)
	public void verifyLoginPageTitleTest()
	{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login to Beamsity"); // No title page displayed in the page source
	}

	
	@Test(priority = 2)
	public void verifyUserCanClickLoginLink()
	{	
//		 homePage.clickOnSignUpLink();
//		 signupPage.clickOnLoginLink();
		
		signupPage = homePage.clickOnSignUpLink();
		loginPage = signupPage.clickOnLoginLink();
	}
	
	
//	@Test(priority = 3)
//	public void verifyUserCanClickOnCreateFreeAcctLink()
//	{
//		signupPage = homePage.clickOnSignUpLink();
//		loginPage = signupPage.clickOnLoginLink();
//		loginPage = loginPage.validateCreateFreeAcct(); 
//	}
//	
	
	
	
	
	
//	@Test(priority = 4) 
//	public void verifyLogin() throws Exception
//	{
//		homePage = loginPage.loginDetails(prop.getProperty("emailAddress"), prop.getProperty("password"));
//	}
//	
	
//	------ Scrap out -------- 
//	@Test(priority = 4)
//	public void loginTest()
//	{
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//	}
	
	
	
	// could not access web element locator
//	public void sigupTest()
//	{
//		loginPage.validateSignUp();
//	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(7000);
		driver.quit(); 
	}
	
	
}
