package com.automation.base;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.test.utils.PropertyReader;
import com.test.utils.UIOperations;
import com.test.utils.Utility;

public class BaseClass {

	protected RemoteWebDriver driver = null;
	protected PageManagerClass pageObjectManager = null;
	protected UIOperations uioperations = null;
	protected PropertyReader propRead = null;
	protected Utility util = null;
	@BeforeClass
	public void init() throws IOException {
	//	System.setProperty("webdriver.chrome.driver",
		//		System.getProperty("user.dir") + "/src/test/resources/Drivers/chromedriver.exe");
		ChromeOptions cap = new ChromeOptions();
		cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.manage().window().maximize();
		driver.get(PropertyReader.getInstance().getConfigProperty("url"));
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
