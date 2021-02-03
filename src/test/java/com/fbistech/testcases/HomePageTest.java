package com.fbistech.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.CompanyPage;
import com.fbistech.pages.ContactUsPage;
import com.fbistech.pages.CoursesPage;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.LogInPage;
import com.fbistech.pages.Sponsors_OrganizationPage;
import com.fbistech.pages.SubscribePage;
import com.fbistech.util.JiraPolicy;
import com.fbistech.util.TestUtil;

public class HomePageTest extends TestBase {
	
	
	
	HomePage homePage;
	CoursesPage coursesPage;
	SubscribePage subscribePage;
	Sponsors_OrganizationPage sponsors_OrganizationPage;
	CompanyPage companyPage;
	LogInPage logInPage;
	ContactUsPage contactUsPage; 
	TestUtil testUtil; // class object 
	
	// once the constructor is called it will automatically call the TestBase() method 
	public HomePageTest()   
	{
		super();
	}
	
	
	// Test cases should separated --- independent with each other
	// Before each test case --- launch the browser and login
	// @Test --- execute test case
	// After each test case --- close the browser
	
	
	@BeforeMethod
	public void setUp() throws Exception
	{  
		initialization();
		homePage = new HomePage();
		coursesPage = new CoursesPage();
		subscribePage = new SubscribePage();
		sponsors_OrganizationPage = new Sponsors_OrganizationPage();
		companyPage = new CompanyPage();
		logInPage = new LogInPage();
		testUtil = new TestUtil(); // Initialize // testUtil = object reference 

//		homePage = signInPage.loginDetails(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	 
	@JiraPolicy(logTicketReady=true)
	@Test(priority = 1)
	public void verifyHomePageTitleTest()
	{
		String homePageTitle = homePage.verifyHomePageTitle(); 
		System.out.println(homePageTitle);
		Assert.assertEquals(homePageTitle, "Beamsity Page Not Found");
	}
	

	@Test(priority = 2)
	public void verifyUserCanClickOnCoursesLink()
	{
		coursesPage = homePage.clickOnCoursesLink();
		
	}
	
	
	@Test(priority = 3)
	public void verifyUserCanClickOnSubcribeLink()
	{
		subscribePage = homePage.clickOnSubscribeLink();
	}
	
	
	@Test(priority = 4)
	public void verifyUserCanClickOnSponsors_OrganizationLinkLink()
	{
		sponsors_OrganizationPage = homePage.clickOnSponsors_OrganizationLink();
	}
	
	
	@Test(priority = 5)
	public void verifyUserCanClickOnCompanyLink()
	{
		companyPage = homePage.clickOnCompanyLink();
	}
	
	
	@Test(priority = 6)
	public void verifyUserCanClickOnLogInLink()
	{
		logInPage = homePage.clickOnLogInLink();
	}
	
	
	@Test(priority = 7)
	public void verifyUserCanClickOnContactUsLink()
	{
		contactUsPage = homePage.clickOnContactUsLink();
	}
	
	
	
	
//	@Test(priority = )
//	public void verifyUsernameOnHomePageTest() 
//	{
////		testU til.switchToFrame();
//		Assert.assertTrue(homePage.verifyUserNameOnHomePage()); 
//		 
//	}
//	
//	
	
	
	
	@AfterMethod
	public void teardown() throws Exception
	{	
		Thread.sleep(3000);
		driver.quit();
	}

}
