package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.Annotations;
// Annotations == ProjectBase
public class CL extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC001_LoginAndLogout";
		testcaseDec = "Login into leaftaps";
		author = "koushik";
		category = "sanity";
		excelFileName = "TC001";
	} 

	@Test(dataProvider="fetchData") 
	public void loginAndLogout(String uName, String pwd) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd) 
		.clickLogin()
		.clickLogout();
		
	}
	
}






