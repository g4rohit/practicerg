package com.primusbank.TestCase;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Helper.BrowserFactory;
import org.openqa.selenium.TakesScreenshot;


import com.primusbank.pages.HomePage;
import com.primusbank.pages.LoginPage;

public class PrimusBankTestCaseNew {

	WebDriver driver;

	@Test(priority = 0)
	public void VerifyLogin() {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\Selenium jars\\ChromeDriver\\chromedriver.exe");
		 * driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://primusbank.qedgetech.com");
		 */

		driver = BrowserFactory.StartBrowser("chrome", "http://primusbank.qedgetech.com"); // Calling this method from
																							// BrowserFactory class

		LoginPage login = new LoginPage(driver);
		login.typeUserName("Admin");
		login.typePassword("Admin");
		login.clickLoginbutton();
		System.out.println("Verified login successfully");

		// Validating Title
		String ActualTitle = driver.getTitle();
		Assert.assertTrue(ActualTitle.contains("Primus BANK"), "Title comparison failed");
		System.out.println("Actual Title is " + ActualTitle);
		
		//Screenshot
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		driver.close();
	}

	@Test(priority = 1)
	public void NavigateToBranchesPage() {
		driver = BrowserFactory.StartBrowser("chrome", "http://primusbank.qedgetech.com");

		// Login using static method declared in LoginPage class
		LoginPage login = new LoginPage(driver);
		login.staticLogin();

		HomePage home = new HomePage();// Creating object for HomePage
		home.ClickBranchesButton(driver);// This was not working before passing driver
		driver.quit();

	}

}
