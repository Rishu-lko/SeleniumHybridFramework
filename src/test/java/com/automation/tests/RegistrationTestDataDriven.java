package com.automation.tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.base.PageManagerClass;
import com.automation.data.DataProviderClass;

public class RegistrationTestDataDriven extends BaseClass {

	@Test(dataProvider="registrationlogin",dataProviderClass=DataProviderClass.class)
	public void testRegistration(String username,String password) throws IOException, Exception {
		System.out.println("Testcase starting ---> testRegistration");
		pageObjectManager = new PageManagerClass(super.returnDriver());
		pageObjectManager.getLandingPage().navigateToLandingPage();
		pageObjectManager.getLandingPage().verifyLandingPageImage();
		pageObjectManager.getLandingPage().clickOnMyAccountLink();
		pageObjectManager.getRegistrationLoginPage().enterRegistrationUserId(username);
		pageObjectManager.getRegistrationLoginPage().enterRegistrationPassword(password);
		pageObjectManager.getRegistrationLoginPage().verifyPasswordStrongText();
		pageObjectManager.getRegistrationLoginPage().clickOnRegisterButton();
		pageObjectManager.getHomePage().verifyHelloText();
		pageObjectManager.getHomePage().clickOnLogOutLink();
		pageObjectManager.getRegistrationLoginPage().verifyLoginBoldText();
		
		
	}

}
