package com.fbistech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fbistech.base.TestBase;

public class Schools_OrganizationsPage extends TestBase{

	
	
	
//	PageFactory - Object Repository 

	@FindBy(xpath = "//button[@id='School/Organization']") 
	WebElement school_OrganizationFormBtn;
	
	@FindBy(xpath = "//input[@id='school-organization']") 
	WebElement school_OrganizationName;
	
	
	@FindBy(xpath = "//input[@id='first_name']") 
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last_name']") 
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='email']") 
	WebElement emailAddress;

	@FindBy(xpath = "//input[@id='phone_number']") 
	WebElement phoneNo;

	
	@FindBy(xpath = "//button[contains(text(),'Proceed')]") 
	WebElement proceedBtn;





//Initializing page objects:
	public Schools_OrganizationsPage()
	{
		PageFactory.initElements(driver, this); 
	}
	
	public Schools_OrganizationsPage clickOnSponsor_OrganizationForm()
	{
		school_OrganizationFormBtn.click();
		return new Schools_OrganizationsPage();
	}
	
	
	public HomePage createNewSchool(String schOrgName, String fN, String lN, String email, String mobileNo)
	{	 
		school_OrganizationName.sendKeys(schOrgName);
		firstName.sendKeys(fN);
		lastName.sendKeys(lN); 
		emailAddress.sendKeys(email);
		phoneNo.sendKeys(mobileNo);
		proceedBtn.click();
		return new HomePage();
	} 
	
	
}
