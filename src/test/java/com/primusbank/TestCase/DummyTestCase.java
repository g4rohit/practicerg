package com.primusbank.TestCase;

import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Helper.BrowserFactory;

public class DummyTestCase 
{
	WebDriver driver;
@Test
public void browserinitialization()
{
	
driver=BrowserFactory.StartBrowser("chrome","http://primusbank.qedgetech.com");




}


	
}
