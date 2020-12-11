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
		super.driver = driver;
	}
 

	public HomePage getHomePage() {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}

	public LandingPage getLandingPage() {

		return (landingPage == null) ? landingPage = new LandingPage(driver) : landingPage;

	}

	public RegistrationLoginPage getRegistrationLoginPage() {

		return (regLoginPage == null) ? regLoginPage = new RegistrationLoginPage(driver) : regLoginPage;

	}

}
