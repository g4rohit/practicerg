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

import com.primusbank.TestCase.Cat;




//URL - http://primusbank.qedgetech.com
// Username: Admin , Pass: Admin


public class PrimusBankProject {
	
	WebDriver driver;  //Global variable
	
	Cat C=new Cat(); // Object for cat class
	
	
@BeforeMethod

//We are logging into a website before the actual test
//BeforeMethod will run before each and every test method
	public void PBLogin(){
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium jars\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		//return driver;
		}

	
	
	
	
	
	@Test(priority=1)
	
	public void BranchCreation(){
		/*System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium jars\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();*/
		
		//Click on New branch
		
		driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		
		//Filling all required information to create a new branch
		driver.findElement(By.id("txtbName")).sendKeys("Newyork");
		driver.findElement(By.id("txtAdd1")).sendKeys("1234 Main street");
		driver.findElement(By.id("txtZip")).sendKeys("10001");
		
		Select dropdown1=new Select(driver.findElement(By.id("lst_counrtyU")));
		dropdown1.selectByVisibleText("USA");
		
		Select dropdown2=new Select(driver.findElement(By.id("lst_stateI")));
		dropdown2.selectByVisibleText("NewYork");
		
		Select dropdown3=new Select(driver.findElement(By.id("lst_cityI")));
		dropdown3.selectByVisibleText("Watertown");
		
		driver.findElement(By.id("btn_insert")).click();  //To submit branch creation
		
		//driver.findElement(By.name("Btn_cancel")).click();  // To cancel branch creation
		
		driver.switchTo().alert().accept();   		//This is a simple 
		
		System.out.println("Successfully created new branch");
		
		//C.eat();
			
	}
	
	@Test
	public void DeleteBranch()
	{
		System.out.println("This is second  test");
	}
	
	
	
@AfterMethod

	private void TestCompleted() {
		System.out.println("Test is successful");
		//driver.close();
		
	}



}
