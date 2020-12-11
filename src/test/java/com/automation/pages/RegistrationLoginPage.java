package com.automation.pages;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.automation.base.BaseClass;
import com.automation.base.Keywords;
import com.test.utils.PropertyReader;
import com.test.utils.UIOperations;

public class RegistrationLoginPage extends BaseClass {

	public RegistrationLoginPage(RemoteWebDriver driver) {
		super.driver = driver;
		super.uioperations = new UIOperations(driver);
		super.propRead = PropertyReader.getInstance();
	}
	
	public void enterRegistrationUserId() throws IOException, Exception {
		uioperations.perform(Keywords.SETTEXT, "registrationEmailId",
				propRead.getORProperty("RegistrationLoginPageOR", "registrationEmailId"),
				propRead.getTestData("emailId"));
	}

	public void enterRegistrationPassword() throws IOException, Exception {
		uioperations.perform(Keywords.SETTEXTBYACTION, "registrationPassword",
				propRead.getORProperty("RegistrationLoginPageOR", "registrationPassword"),
				propRead.getTestData("regPassword"));
	}

	public void enterRegistrationUserId(String username) throws IOException, Exception {
		uioperations.perform(Keywords.SETTEXT, "registrationEmailId",
				propRead.getORProperty("RegistrationLoginPageOR", "registrationEmailId"), username);
	}

	public void enterRegistrationPassword(String password) throws IOException, Exception {
		uioperations.perform(Keywords.SETTEXTBYACTION, "registrationPassword",
				propRead.getORProperty("RegistrationLoginPageOR", "registrationPassword"), password);
	}

	public void verifyPasswordStrongText() throws IOException, Exception {
		uioperations.perform(Keywords.VERIFYELEMENTPRESENT, "registrationPageStrongText",
				propRead.getORProperty("RegistrationLoginPageOR", "registrationPageStrongText"));
	}

	public void clickOnRegisterButton() throws IOException, Exception {
		uioperations.perform(Keywords.CLICK, "registerButton",
				propRead.getORProperty("RegistrationLoginPageOR", "registerButton"));
	}
	
	public void enterLoginUserId() throws IOException, Exception {
		uioperations.perform(Keywords.SETTEXT, "loginEmail",
				propRead.getORProperty("RegistrationLoginPageOR", "loginEmail"), propRead.getTestData("emailId"));
	}

	public void enterLoginPassword() throws IOException, Exception {
		uioperations.perform(Keywords.SETTEXT, "loginPassword",
				propRead.getORProperty("RegistrationLoginPageOR", "loginPassword"),
				propRead.getTestData("regPassword"));
	}

	public void enterLoginUserId(String username) throws IOException, Exception {
		uioperations.perform(Keywords.SETTEXT, "loginEmail",
				propRead.getORProperty("RegistrationLoginPageOR", "loginEmail"), username);
	}

	public void enterLoginPassword(String password) throws IOException, Exception {
		uioperations.perform(Keywords.SETTEXT, "loginPassword",
				propRead.getORProperty("RegistrationLoginPageOR", "loginPassword"), password);
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
