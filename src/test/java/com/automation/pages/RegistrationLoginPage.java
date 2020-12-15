package com.automation.pages;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.automation.base.BaseClass;
import com.automation.base.Keywords;
import com.test.utils.PropertyReader;
import com.test.utils.UIOperations;

public class RegistrationLoginPage extends BaseClass {

	public RegistrationLoginPage(RemoteWebDriver driver) {
		super.setDriver(driver);
		super.uioperations = new UIOperations(driver);
		super.propRead = PropertyReader.getInstance();
	}
	
	public void enterRegistrationUserId(String registrationID) throws IOException, Exception {
		uioperations.perform(Keywords.SETTEXT, "registrationEmailId",
				propRead.getORProperty("RegistrationLoginPageOR", "registrationEmailId"),
				registrationID);
	}

	public void enterRegistrationPassword(String regPassword) throws IOException, Exception {
		uioperations.perform(Keywords.SETTEXTBYACTION, "registrationPassword",
				propRead.getORProperty("RegistrationLoginPageOR", "registrationPassword"),
				regPassword);
	}


	public void verifyPasswordStrongText() throws IOException, Exception {
		uioperations.perform(Keywords.VERIFYELEMENTPRESENT, "registrationPageStrongText",
				propRead.getORProperty("RegistrationLoginPageOR", "registrationPageStrongText"));
	}

	public void clickOnRegisterButton() throws IOException, Exception {
		uioperations.perform(Keywords.CLICK, "registerButton",
				propRead.getORProperty("RegistrationLoginPageOR", "registerButton"));
	}	

	public void enterLoginUserId(String loginId) throws IOException, Exception {
		uioperations.perform(Keywords.SETTEXT, "loginEmail",
				propRead.getORProperty("RegistrationLoginPageOR", "loginEmail"), loginId);
	}

	public void enterLoginPassword(String loginPassword) throws IOException, Exception {
		uioperations.perform(Keywords.SETTEXT, "loginPassword",
				propRead.getORProperty("RegistrationLoginPageOR", "loginPassword"), loginPassword);
	}

	public void clickOnLoginButton() throws IOException, Exception {
		uioperations.perform(Keywords.CLICK, "loginButton",
				propRead.getORProperty("RegistrationLoginPageOR", "loginButton"));
	}

	public void verifyLoginBoldText() throws IOException, Exception {
		uioperations.perform(Keywords.VERIFYELEMENTPRESENT, "loginBoldText",
				propRead.getORProperty("RegistrationLoginPageOR", "loginBoldText"));
	}

}
