package com.automation.tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.base.PageManagerClass;

public class LoginTest extends BaseClass{
	
	@Test
	public void testLogin(Method method) throws IOException, Exception {
		System.out.println("Testcase starting ---> "+ method.getName());
		pageObjectManager = new PageManagerClass(driver);
		pageObjectManager.getLandingPage().verifyLandingPageImage();
		pageObjectManager.getLandingPage().clickOnMyAccountLink();
		pageObjectManager.getRegistrationLoginPage().enterLoginUserId();
		pageObjectManager.getRegistrationLoginPage().enterLoginPassword();
		pageObjectManager.getRegistrationLoginPage().clickOnLoginButton();
		pageObjectManager.getHomePage().verifyHelloText();
		pageObjectManager.getHomePage().clickOnLogOutLink();
		pageObjectManager.getRegistrationLoginPage().verifyLoginBoldText();
	}

}
