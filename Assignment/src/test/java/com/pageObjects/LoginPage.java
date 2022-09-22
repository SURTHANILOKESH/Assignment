package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.configuration.Config;
import com.testCases.BaseClass;

public class LoginPage extends BaseClass{


	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username' and @name ='username']")
	@CacheLookup
	WebElement emailInput;

	@FindBy(xpath = "//input[@id='password' and @name ='password']")
	@CacheLookup
	WebElement passwordInput;

	@FindBy(xpath = "//input[@id='kc-login' and @name ='login']")
	@CacheLookup
	WebElement loginButton;

	public void setEmail() {
		emailInput.click();
		emailInput.sendKeys(readConfig.getEmail());
	}

	public void setPassword() {
		passwordInput.click();
		passwordInput.sendKeys(readConfig.getPassword());
	}

	public void clickOnSignin() {
		loginButton.click();
	}

}
