package com.fbistech.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.SponsorsPage;

public class SponsorPageTest extends TestBase{
	
	HomePage homePage;
	SponsorsPage sponsorsPage;
	
	public SponsorPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		homePage = new HomePage();
		sponsorsPage = new SponsorsPage(); 
		
	}

	
	
	
	
	@Test(priority = 1) 
	public void verifyUserCanClickSponsorLink() 
	{
		sponsorsPage = homePage.clickOnSponsorsLink();
	}
	
	@Test(priority = 2) 
	public void verifyUserCanClickOnSporsorFormBtn() throws Exception
	{
		 sponsorsPage = homePage.clickOnSponsorsLink();
		 Thread.sleep(3000);
		 sponsorsPage = sponsorsPage.clickOnSponsorForm();  
	}

	
	@Test(priority = 3) 
	public void verifyUserCanFillSponsorForm() throws Exception
	{
		 sponsorsPage = homePage.clickOnSponsorsLink();
		 Thread.sleep(3000);
		 sponsorsPage = sponsorsPage.clickOnSponsorForm();
		 homePage = sponsorsPage.createNewSponsor(prop.getProperty("firstName"), prop.getProperty("lastName"),
				 prop.getProperty("emailAddress"), prop.getProperty("phoneNo"));
	}
	
	@Test(priority = 4) 
	public void verifyCountryDropdownValue()
	{	 
		sponsorsPage = homePage.clickOnSponsorsLink();
		sponsorsPage = sponsorsPage.clickOnSponsorForm();
		sponsorsPage = sponsorsPage.verifyCountryDropdownValue();
	}
	
	@Test(priority = 5) 
	public void verifyCityDropdownValue()
	{	 
		sponsorsPage = homePage.clickOnSponsorsLink();
		sponsorsPage = sponsorsPage.clickOnSponsorForm();
		sponsorsPage = sponsorsPage.verifyCityropdownValue();
	}
	
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(3000);
		driver.quit(); 
	}
}
