package com.seleniumeasy.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.praticeflipkart.browser.Base;
import com.seleniumeasy.pageobjects.RadioButtonPage;
import com.seleniumeasy.script.RadioButtonScript;

public class RadioButtonTest extends Base{
	
	
	RadioButtonPage radiobuttonpage = null;
	
	RadioButtonScript radiobuttonscript = null;
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void lunchRequriments() throws IOException
	{
		driver = browserLaunch();
		
		radiobuttonpage = new RadioButtonPage(driver);
		
		radiobuttonscript = new RadioButtonScript(driver);
	}
	
	@Test(priority = 0 ,enabled = true)
	public void radioButtonsDemo() throws InterruptedException
	{
		radiobuttonpage.demoButton();
		
		radiobuttonpage.closeCrossMark();
		
		radiobuttonpage.inputFormsButton();
		
		radiobuttonpage.radioButtonDemo();
		
		radiobuttonpage.radioButton1();
		
		radiobuttonpage.get_CheckedValue();
		
		radiobuttonpage.radioButtonDisplay();
	}
	
	@Test(priority = 1 ,enabled = true)
	public void radioButtonsDemo1() throws InterruptedException
	{
		radiobuttonpage.demoButton();
		
		radiobuttonpage.closeCrossMark();
		
		radiobuttonpage.inputFormsButton();
		
		radiobuttonpage.radioButtonDemo();
		
		radiobuttonscript.clickOnGender();
		
		radiobuttonscript.age();
		
		radiobuttonscript.getValues();
		
		radiobuttonscript.getValuesDispay();
		
	}
	@AfterMethod
	public void tearDown()
	{
		//browserClose();
	}
	
	

}
