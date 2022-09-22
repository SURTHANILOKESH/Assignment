package com.testCases;

import org.testng.annotations.Test;

import com.pageObjects.Registration;

public class TC_RegisterTest extends BaseClass{
	
	@Test
	public void registerTest() {
	Registration register= new Registration();
	
	
	register.clickRegister();
	register.enterEmail();
	register.enterPasscode();
	register.confirmPasscode();
	register.finalRegister();
	}
	

}
