package com.fbistech.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.School_OrganizationPage;
import com.fbistech.pages.SponsorsPage;

public class School_OrganizationPageTest extends TestBase
{
	HomePage homePage;
	SponsorsPage sponsorsPage;
	School_OrganizationPage school_OrganizationPage;
	
	public School_OrganizationPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		homePage = new HomePage();
		sponsorsPage = new SponsorsPage();
		school_OrganizationPage = new School_OrganizationPage();
		
	}
	
	
	
	@Test(priority = 1) 
	public void verifyUserCanClickSponsorLink() 
	{
		sponsorsPage = homePage.clickOnSponsorsLink();
	}
	
	
	@Test(priority = 2) 
	public void verifyUserCanClickOnSchoolFormBtn() throws Exception
	{
		sponsorsPage = homePage.clickOnSponsorsLink();
		Thread.sleep(3000);
		school_OrganizationPage = school_OrganizationPage.clickOnSponsor_OrganizationForm();	
	}
	
	
	@Test(priority = 3) 
	public void verifyUserCanFillSponsorForm() throws Exception
	{
		sponsorsPage = homePage.clickOnSponsorsLink();
		Thread.sleep(3000);
		school_OrganizationPage = school_OrganizationPage.clickOnSponsor_OrganizationForm();
		homePage = school_OrganizationPage.createNewSchool(prop.getProperty("school_OrganizationName"),prop.getProperty("firstName"), 
				prop.getProperty("lastName"), prop.getProperty("emailAddress"), prop.getProperty("phoneNo"));
	}
	
	
	

	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(3000);
		driver.quit(); 
	}
}
