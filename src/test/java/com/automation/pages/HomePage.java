package com.automation.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.automation.base.BaseClass;
import com.automation.base.Keywords;
import com.test.utils.PropertyReader;
import com.test.utils.UIOperations;

public class HomePage extends BaseClass {

	public HomePage(RemoteWebDriver driver) {
		super.setDriver(driver);
		super.uioperations = new UIOperations(driver);
		super.propRead = PropertyReader.getInstance();
	}

	public void verifyHelloText() throws IOException, Exception {
		uioperations.perform(Keywords.VERIFYELEMENTPRESENT, "homePageHelloText",
				propRead.getORProperty("HomePageOR", "homePageHelloText"));
	}

	public void clickOnLogOutLink() throws IOException, Exception {
		uioperations.perform(Keywords.CLICK, "homePageSignOutLink",
				propRead.getORProperty("HomePageOR", "homePageSignOutLink"));
	}

}
