package com.automation.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.test.utils.PropertyReader;
import com.test.utils.UIOperations;
import com.test.utils.Utility;

public class BaseClass {

	protected WebDriver driver = null;
	protected PageManagerClass pageObjectManager = null;
	protected UIOperations uioperations = null;
	protected PropertyReader propRead = null;
	protected Utility util = null;
	@BeforeClass
	public void init() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(PropertyReader.getInstance().getConfigProperty("url"));
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
