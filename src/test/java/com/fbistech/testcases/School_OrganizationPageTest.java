package com.fbistech.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.Schools_OrganizationsPage;
import com.fbistech.pages.Sponsors_OrganizationPage;
import com.fbistech.util.JiraPolicy;

public class School_OrganizationPageTest extends TestBase
{
	HomePage homePage;
	Sponsors_OrganizationPage sponsors_OrganizationPage;
	Schools_OrganizationsPage schools_OrganizationsPage;
	
	public School_OrganizationPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization(); 
		
		homePage = new HomePage();
		sponsors_OrganizationPage = new Sponsors_OrganizationPage();
		schools_OrganizationsPage = new Schools_OrganizationsPage();
		
	}
	
	 
	@JiraPolicy(logTicketReady=true)
	@Test(priority = 1) 
	public void verifyUserCanClickSponsorLink() 
	{
		sponsors_OrganizationPage = homePage.clickOnSponsors_OrganizationLink();
	}
	
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority = 2) 
	public void verifyUserCanClickOnSchoolFormBtn() throws Exception
	{
		sponsors_OrganizationPage = homePage.clickOnSponsors_OrganizationLink();
		Thread.sleep(3000);
		schools_OrganizationsPage = schools_OrganizationsPage.clickOnSponsor_OrganizationForm();	
	}
	
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority = 3) 
	public void verifyUserCanFillSponsorForm() throws Exception
	{
		sponsors_OrganizationPage = homePage.clickOnSponsors_OrganizationLink();
		Thread.sleep(3000);
		schools_OrganizationsPage = schools_OrganizationsPage.clickOnSponsor_OrganizationForm();
		homePage = schools_OrganizationsPage.createNewSchool(prop.getProperty("school_OrganizationName"),prop.getProperty("firstName"), 
				prop.getProperty("lastName"), prop.getProperty("emailAddress"), prop.getProperty("phoneNo"));
	}
	
	
	

	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(3000);
		driver.quit(); 
	}
}
