package com.fbistech.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.School_OrganizationPage;
import com.fbistech.pages.SponsorsPage;
import com.fbistech.pages.TutorPage;

public class TutorPageTest extends TestBase {
	
	
	HomePage homePage;
	SponsorsPage sponsorsPage;
	TutorPage tutorPage;
	
	public TutorPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		homePage = new HomePage();
		sponsorsPage = new SponsorsPage();
		tutorPage = new TutorPage();
		
	}
	
	
	@Test(priority = 1) 
	public void verifyUserCanClickSponsorLink() 
	{
		sponsorsPage = homePage.clickOnSponsorsLink();
	}

	
	@Test(priority = 2) 
	public void verifyUserCanFillTutorForm() throws Exception
	{
		sponsorsPage = homePage.clickOnSponsorsLink();

		Thread.sleep(3000);
		
		homePage = tutorPage.createNewTutor(prop.getProperty("firstName"), prop.getProperty("lastName"), 
				prop.getProperty("emailAddress"), prop.getProperty("phoneNo"), prop.getProperty("uploadCourseFile"));
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(3000);
		driver.quit(); 
	}
	
}
