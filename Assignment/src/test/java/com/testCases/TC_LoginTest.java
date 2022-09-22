package com.testCases;

import org.testng.annotations.Test;

import com.pageObjects.LoginPage;


public class TC_LoginTest extends BaseClass{

	
	@Test
	public void loginTest() {
		LoginPage loginPage = new LoginPage();
		
		loginPage.setEmail();
		loginPage.setPassword();
		loginPage.clickOnSignin();
		
	}
}
