package com.test.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.base.BaseClass;

public class UIOperations extends BaseClass {


	public UIOperations(WebDriver driver) {
		super.driver = driver;
		super.util = Utility.getInstance();
	}	

	public String perform(String operation, String objectName, String objectValue, String... data)
			throws InterruptedException, Exception {
		System.out.println("Performing ----> " + operation + " on Element ---> " + objectName);
		String result = null;
		switch (operation) {
		case "CLICK":
			util.waitForPresenceOfElement(driver, this.getObject(objectValue)).click();
			break;
		case "SETTEXT":
			util.waitForPresenceOfElement(driver, this.getObject(objectValue)).sendKeys(data[0]);
			break;
		case "GOTOURL":
			driver.get(data[0]);
			break;
		case "GETTEXT":
			result = util.waitForPresenceOfElement(driver, this.getObject(objectValue)).getText();
			break;
		case "VERIFYELEMENTPRESENT":
			util.waitForPresenceOfElement(driver, this.getObject(objectValue));
			break;
		default:
			break;
		}
		return result;
	}

	private By getObject(String objectName) throws Exception {
		String objectArray[] = objectName.split(":");
		if (objectArray[0].equalsIgnoreCase("XPATH")) {

			return By.xpath(objectArray[1]);
		}

		else if (objectArray[0].equalsIgnoreCase("CSSSELECTOR")) {

			return By.cssSelector(objectArray[1]);

		}

		else if (objectArray[0].equalsIgnoreCase("ID")) {

			return By.name(objectArray[1]);

		}

		else if (objectArray[0].equalsIgnoreCase("CLASSNAME")) {

			return By.className(objectArray[1]);

		}

		else if (objectArray[0].equalsIgnoreCase("NAME")) {

			return By.name(objectArray[1]);

		}

		else if (objectArray[0].equalsIgnoreCase("LINKTEXT")) {

			return By.linkText(objectArray[1]);

		}

		else if (objectArray[0].equalsIgnoreCase("PARTIALLINKTEXT")) {

			return By.partialLinkText(objectArray[1]);

		} else if (objectArray[0].equalsIgnoreCase("TAGNAME")) {

			return By.tagName(objectArray[1]);

		}

		else {
			throw new Exception("Wrong object type");
		}
	}

}
