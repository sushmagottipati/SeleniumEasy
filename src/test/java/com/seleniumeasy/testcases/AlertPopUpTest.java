package com.seleniumeasy.testcases;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.praticeflipkart.browser.Base;
import com.praticeflipkart.script.ElectronicsMobilesScript;
import com.praticeflipkart.script.LoginScript;
import com.seleniumeasy.pageobjects.RadioButtonPage;
import com.seleniumeasy.script.AlertPopUpScript;

public class AlertPopUpTest extends Base {
	

	
	WebDriver driver = null;
	
	RadioButtonPage radiobuttonpage = null;
	
	AlertPopUpScript alertpopupscript = null;

	@BeforeMethod
	public void launch() throws InterruptedException
	{
		driver = browserLaunch();
		
		radiobuttonpage = new RadioButtonPage(driver);
		
		alertpopupscript = new AlertPopUpScript(driver);
		
		
	}
	
	@Test(enabled = true)
	public void TC_001_switchToAlert()
	{
		
		radiobuttonpage.demoButton();
		
		radiobuttonpage.closeCrossMark();
		
		alertpopupscript.switchTo_Alert();
			
	}
	
	@Test(enabled = true)
	public void TC_002_switchToAlert()
	{
		
		radiobuttonpage.demoButton();
		
		radiobuttonpage.closeCrossMark();
		
		alertpopupscript.switchTo_Alert();
		
		alertpopupscript.confirm_Box();
			
	}
	
	@Test(enabled = true)
	public void TC_003_switchToAlert() throws InterruptedException
	{
		
		radiobuttonpage.demoButton();
		
		radiobuttonpage.closeCrossMark();
		
		alertpopupscript.switchTo_Alert();
		
		alertpopupscript.prompt_Box();
			
	}
	
	@AfterMethod
	public void tearDown()
	{
		//browserClose();
	}

}
