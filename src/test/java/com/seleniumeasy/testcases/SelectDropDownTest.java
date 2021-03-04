package com.seleniumeasy.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.praticeflipkart.browser.Base;
import com.seleniumeasy.pageobjects.RadioButtonPage;
import com.seleniumeasy.script.RadioButtonScript;
import com.seleniumeasy.script.SelectDropDownScript;

public class SelectDropDownTest extends Base {

	WebDriver driver;
	
	RadioButtonPage radiobuttonpage = null;


	SelectDropDownScript selectdropdownscript = null;
	@BeforeMethod
	public void lunchRequriments() throws IOException
	{
		driver = browserLaunch();
		
		radiobuttonpage = new RadioButtonPage(driver);


		selectdropdownscript = new SelectDropDownScript(driver);


	}

	@Test
	public void selectDropDown() throws InterruptedException
	{
		radiobuttonpage.demoButton();

		radiobuttonpage.closeCrossMark();

		radiobuttonpage.inputFormsButton();
		
		selectdropdownscript.inputformSelectDropDown();
		
		selectdropdownscript.selectDropDownValue();
		
		//selectdropdownscript.deselctValue();
		
		selectdropdownscript.multiSelectDropDown();
		
		selectdropdownscript.getAllSelectedOptions();
		
		selectdropdownscript.deselctAll();
		
		
	}

	@AfterMethod
	public void tearDown()
	{
		//browserClose();
	}

}
