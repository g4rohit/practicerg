package com.primusbank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

	By BranchesButton = By.xpath("//a[@href='admin_banker_master.aspx']");
	By RolesButton = By.xpath("//a[@href='Admin_Roles_details.aspx']//img[@height='24']");
	By UsersButton = By.xpath("//a[@href='userdetails.aspx']//img[@height'24']");
	By EmployeeButton = By.xpath("//a[@href='Admin_Emp_details.aspx']");
	By AboutUS = By.xpath("//a[@href='aboutus.html']//img[@height='27']");
	

	public void ClickBranchesButton(WebDriver driver) {
		driver.findElement(BranchesButton).click();
		// driver.findElement(By.xpath("//a[@href='admin_banker_master.aspx']")).click();
	}

	public void ClickRolesButton(WebDriver driver) {
		driver.findElement(RolesButton).click();
	}

	public void ClickUsersButton(WebDriver driver) {
		driver.findElement(UsersButton).click();
	}

	public void ClickEmployeeButton(WebDriver driver) {
		driver.findElement(EmployeeButton).click();
	}

}
