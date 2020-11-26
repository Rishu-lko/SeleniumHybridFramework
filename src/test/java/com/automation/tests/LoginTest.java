package com.automation.tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.base.PageManagerClass;
import com.automation.data.DataProviderClass;

public class LoginTest extends BaseClass{
	
	@Test(dataProvider="registrationlogin",dataProviderClass=DataProviderClass.class)
	public void testLogin(String username,String password) throws IOException, Exception {
		System.out.println("Testcase starting ---> testLogin");
		pageObjectManager = new PageManagerClass(driver);
		pageObjectManager.getLandingPage().navigateToLandingPage();
		pageObjectManager.getLandingPage().verifyLandingPageImage();
		pageObjectManager.getLandingPage().clickOnMyAccountLink();
		pageObjectManager.getRegistrationLoginPage().enterLoginUserId(username);
		pageObjectManager.getRegistrationLoginPage().enterLoginPassword(password);
		pageObjectManager.getRegistrationLoginPage().clickOnLoginButton();
		pageObjectManager.getHomePage().verifyHelloText();
		pageObjectManager.getHomePage().clickOnLogOutLink();
		pageObjectManager.getRegistrationLoginPage().verifyLoginBoldText();
	}

}
