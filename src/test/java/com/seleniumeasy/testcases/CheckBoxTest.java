package com.seleniumeasy.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.praticeflipkart.browser.Base;
import com.seleniumeasy.script.CheckBoxScript;
import com.seleniumeasy.script.SimpleFormScript;

public class CheckBoxTest extends Base{
	
	WebDriver driver = null;
	
	CheckBoxScript checkboxscript = null;
	
	
	@BeforeMethod
	public void lunchRequriments() throws IOException
	{
		driver = browserLaunch();
		
		checkboxscript = new CheckBoxScript(driver);
		
		
	}
	
	
	@Test
	public void checkBoxsDemo()
	{
		checkboxscript.checkBoxDemo();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		//browserClose();
	}
	
	
	

}
