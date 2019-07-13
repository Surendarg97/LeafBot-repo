package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;


public class CreateLeadPage extends Annotations{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(how=How.ID, using="createLeadForm_companyName") 
	WebElement eleCompanyName;
	@FindBy(how=How.ID, using="createLeadForm_firstName") 
	WebElement eleFirstName;
	@FindBy(how=How.ID, using="createLeadForm_lastName") 
	WebElement eleLastName;
	@FindBy(how=How.CLASS_NAME, using="smallSubmit") 
	WebElement eleSubmit;
	
	public CreateLeadPage typeCompanyName(String cName) {
		clearAndType(eleCompanyName, cName);  
		return this;
	}
	
	public CreateLeadPage typeFirstName(String fName) {
		clearAndType(eleFirstName, fName);  
		return this;
	}
	
	public CreateLeadPage typeLastName(String lName) {
		clearAndType(eleLastName, lName);  
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		click(eleSubmit);
		return new ViewLeadPage();
	}
	
}
