package com.automation.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.automation.base.BaseClass;
import com.automation.base.Keywords;
import com.test.utils.PropertyReader;
import com.test.utils.UIOperations;

public class LandingPage extends BaseClass {

	public LandingPage(WebDriver driver) {
		super.driver = driver;
		super.uioperations = new UIOperations(driver);
		super.propRead = PropertyReader.getInstance();
	}

	public void verifyLandingPageImage() throws IOException, Exception {
		uioperations.perform(Keywords.VERIFYELEMENTPRESENT, "landingPageImage",
				propRead.getORProperty("LandingPageOR", "landingPageImage"));
	}

	public void clickOnMyAccountLink() throws IOException, Exception {
		uioperations.perform(Keywords.CLICK, "landingPageMyAccount",
				propRead.getORProperty("LandingPageOR", "landingPageMyAccount"));
	}

	public void navigateToLandingPage() throws IOException, Exception {
		uioperations.perform(Keywords.GOTOURL, "landingPageMyAccount", null, propRead.getConfigProperty("url"));
	}

}
