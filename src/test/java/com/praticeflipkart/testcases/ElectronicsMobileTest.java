package com.praticeflipkart.testcases;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.praticeflipkart.browser.Base;
import com.praticeflipkart.script.ElectronicsMobilesScript;
import com.praticeflipkart.script.LoginScript;
import com.praticeflipkart.script.SearchScript;

public class ElectronicsMobileTest extends Base {

	ElectronicsMobilesScript electronicsmobilescript = null;
	
	LoginScript loginscript = null;
	
	WebDriver driver = null;
	
	

	@BeforeMethod
	public void launch() throws InterruptedException
	{
		driver = browserLaunch();
		
		loginscript = new LoginScript(driver);
		
		electronicsmobilescript = new ElectronicsMobilesScript(driver);

	}
	@Test
	public void electronicsMobile() throws InterruptedException, AWTException
	{
		loginscript.validUsername_ValidPassword_Login();
		
		//driver.navigate().refresh();
		
		
		//driver.navigate().back();
		
		//driver.navigate().forward();

		electronicsmobilescript.moveToElement();
		
		//electronicsmobilescript.doubleClickOnElement();
		
		//electronicsmobilescript.contextClickOnElement();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//browserClose();
	}

}
