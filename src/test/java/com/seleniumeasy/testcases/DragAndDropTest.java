package com.seleniumeasy.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.praticeflipkart.browser.Base;
import com.seleniumeasy.pageobjects.RadioButtonPage;
import com.seleniumeasy.script.DragAndDropScript;
import com.seleniumeasy.script.RadioButtonScript;

public class DragAndDropTest extends Base {
	
	RadioButtonPage radiobuttonpage = null;
	
	DragAndDropScript dragandDropscript = null;
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void lunchRequriments()
	{
		driver = browserLaunch();
		
		radiobuttonpage = new RadioButtonPage(driver);
		
		dragandDropscript = new DragAndDropScript(driver);
	}
	
	@Test
	public void dragAndDrop() throws InterruptedException
	{
		radiobuttonpage.demoButton();
		
		radiobuttonpage.closeCrossMark();
		
		dragandDropscript.dragAndDropElements();
	}
	
	@AfterMethod
	public void tearDown()
	{
		//browserClose();
	}

}
