/**
 * 
 */
package com.primusbank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {
	
	WebDriver driver;  // This is local reference variable for WebDriver
	
	By username=By.id("txtuId"); // Here By method is pulled from By class(see imported By class/package)
	By password=By.name("txtPword");  // Locator = Name
	By loginButton=By.xpath("//input[@id='login']"); // Locator = xpath
	
	public LoginPage(WebDriver driver)  // Whenever we call this driver from any test case, this constructor will initialize the local variable WebDriver
	{
		this.driver=driver;
	}
	public void typeUserName(String uid)        // Method to type username
	{
		driver.findElement(username).sendKeys(uid);    
	}
	public void typePassword(String pass) 		//Method to type password
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void clickLoginbutton()				//Method to click on login button
	{
		driver.findElement(loginButton).click();
	}
	//This method is login with static login credentials
	public void staticLogin()
	{
		LoginPage staticLgn= new LoginPage(driver);
		staticLgn.typeUserName("Admin");
		staticLgn.typePassword("Admin");
		staticLgn.clickLoginbutton();	
	}
	
	}
	

