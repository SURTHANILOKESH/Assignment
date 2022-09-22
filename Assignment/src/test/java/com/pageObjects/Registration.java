package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testCases.BaseClass;

public class Registration extends BaseClass{

	
	public Registration() {
		PageFactory.initElements(driver, this);
	}
	
	//Register button
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	@CacheLookup
	WebElement registerButton;
	
	public void clickRegister() {
		registerButton.click();
	}
	
	//enter email login id
	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement enterEmail;
	
	public void enterEmail() {
		enterEmail.click();
		enterEmail.sendKeys(readConfig.getEmail());
	}
	
	//enter password
	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement enterPassword;
	
	public void enterPasscode() {
		enterPassword.click();
		enterPassword.sendKeys(readConfig.getPassword());
	}
	
	//config password
	@FindBy(xpath = "//input[@id='password-confirm']")
	@CacheLookup
	WebElement confirmPassword;
	
	public void confirmPasscode() {
		confirmPassword.click();
		confirmPassword.sendKeys(readConfig.getPassword());
	}
	
	//click on register button
	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup
	WebElement finalRegister;
	
	public void finalRegister() {
		finalRegister.click();
	}
	
	
	
	
	
}
