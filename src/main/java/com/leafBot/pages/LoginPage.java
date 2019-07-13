package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPage extends Annotations{ 

	public LoginPage() {
		PageFactory.initElements(driver, this); 
	}
	@CacheLookup
	@FindBy(how=How.ID, using="username") 
	WebElement eleUserName;
	@FindBy(how=How.ID, using="password") 
	WebElement elePassWord;
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") 
	WebElement eleLogin;
	@Given("Enter the Username as (.*)")
	public LoginPage enterUserName(String data) {
		clearAndType(eleUserName, data);  
		return this; 
	}
	@Given("Enter the password as (.*)")
	public LoginPage enterPassWord(String data) {
		clearAndType(elePassWord, data); 
		return this; 
	}
	@When("Click on the login button")
	public HomePage clickLogin() {
		click(eleLogin);  
		return new HomePage();
	}
}


