package com.automation.base;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.automation.pages.HomePage;
import com.automation.pages.LandingPage;
import com.automation.pages.RegistrationLoginPage;

public class PageManagerClass extends BaseClass{
	private HomePage homePage = null;
	private LandingPage landingPage = null;
	private RegistrationLoginPage regLoginPage = null;
	
	public PageManagerClass(RemoteWebDriver driver){
		super.setDriver(driver);
	}
 

	public HomePage getHomePage() {

		return (homePage == null) ? homePage = new HomePage(super.returnDriver()) : homePage;

	}

	public LandingPage getLandingPage() {

		return (landingPage == null) ? landingPage = new LandingPage(super.returnDriver()) : landingPage;

	}

	public RegistrationLoginPage getRegistrationLoginPage() {

		return (regLoginPage == null) ? regLoginPage = new RegistrationLoginPage(super.returnDriver()) : regLoginPage;

	}

}
