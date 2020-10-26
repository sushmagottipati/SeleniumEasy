package com.seleniumeasy.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.praticeflipkart.browser.Base;
import com.seleniumeasy.script.SimpleFormScript;

public class SimpleFormTest extends Base {
	
	WebDriver driver = null;
	
	SimpleFormScript simpleformscript = null;
	
	
	@BeforeMethod
	public void lunchRequriments()
	{
		driver = browserLaunch();
		
		simpleformscript = new SimpleFormScript(driver);
		
		
	}
	
	@Test
	public void sampleFormsDemo()
	{
		simpleformscript.sampleFormDemo();
	}
	
	
	/*
	 * public void SampleForDemo1() { inputformsscript.sampleForDemo1(); }
	 */
	
	
	@AfterMethod
	public void tearDown()
	{
		//browserClose();
	}
	

}
