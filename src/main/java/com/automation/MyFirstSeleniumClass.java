package com.automation;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstSeleniumClass {

	public static void main(String args[]) throws InterruptedException, AWTException {
		// System.out.println("Enter the url you want to open");
		// Scanner sc = new Scanner(System.in);
		// String url=sc.nextLine();
		// Console console = System.console();
		// if (console!=null) {
		System.out.println("Enter the url you want to open");
		// String url = console.readLine();

		MyFirstSeleniumClass firstClass = new MyFirstSeleniumClass();
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation Testing Overview\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		while (!js.executeScript("return document.readyState;").equals("complete")) {
			Thread.sleep(1000);
		}
		//driver.switchTo().frame(0);
		WebElement source = firstClass.waitForVisibilityOfElement(driver, By.xpath("//div[@id='draggable']"));
		WebElement target = firstClass.waitForVisibilityOfElement(driver, By.xpath("//div[@id='droppable']"));

		Actions actions = new Actions(driver);
		actions.clickAndHold(source).moveToElement(target).release(target).build().perform();
		Thread.sleep(2000);
		driver.quit();
	}

	public WebElement waitForVisibilityOfElement(WebDriver driver, By locator) {
		Wait wait = new WebDriverWait(driver, 20);
		WebElement element = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
	}

}
