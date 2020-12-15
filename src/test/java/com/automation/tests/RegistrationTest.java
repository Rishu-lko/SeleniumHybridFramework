package com.automation.tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.base.PageManagerClass;

public class RegistrationTest extends BaseClass {

	@Test
	public void testRegistration(Method method) throws IOException, Exception {
		System.out.println("Testcase starting ---> " + method.getName());
		pageObjectManager = new PageManagerClass(super.returnDriver());
		pageObjectManager.getLandingPage().verifyLandingPageImage();
		pageObjectManager.getLandingPage().clickOnMyAccountLink();
		pageObjectManager.getRegistrationLoginPage().enterRegistrationUserId(propRead.getTestData("emailId"));
		pageObjectManager.getRegistrationLoginPage().enterRegistrationPassword(propRead.getTestData("regPassword"));
		pageObjectManager.getRegistrationLoginPage().verifyPasswordStrongText();
		pageObjectManager.getRegistrationLoginPage().clickOnRegisterButton();
		pageObjectManager.getHomePage().verifyHelloText();
		pageObjectManager.getHomePage().clickOnLogOutLink();
		pageObjectManager.getRegistrationLoginPage().verifyLoginBoldText();
	}

}
