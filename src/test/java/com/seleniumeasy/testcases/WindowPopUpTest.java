package com.seleniumeasy.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.praticeflipkart.browser.Base;
import com.seleniumeasy.pageobjects.RadioButtonPage;
import com.seleniumeasy.script.AlertPopUpScript;
import com.seleniumeasy.script.WindowPopUpScript;

public class WindowPopUpTest extends Base{
	
WebDriver driver = null;
	
	RadioButtonPage radiobuttonpage = null;
	
	WindowPopUpScript windowpopupscript = null;

	@BeforeMethod
	public void launch() throws InterruptedException, IOException{
	
		driver = browserLaunch();
		
		radiobuttonpage = new RadioButtonPage(driver);
		
		windowpopupscript = new WindowPopUpScript(driver);
			
	}
	@Test(enabled = false)
	public void TC_001_switchToAlert_WindowPopUp(){
	
		radiobuttonpage.demoButton();
		
		radiobuttonpage.closeCrossMark();
		
		windowpopupscript.alert_Modals();
		
		windowpopupscript.window_PopUpModal();
		
		windowpopupscript.window_PopUpModal_SinglePopUp_Twitter();				
	}
	@Test(enabled = true)
	public void TC_002_switchToAlert_WindowPopup(){
	
		radiobuttonpage.demoButton();
		
		radiobuttonpage.closeCrossMark();
		
		windowpopupscript.alert_Modals();
		
		windowpopupscript.window_PopUpModal();
		
		boolean multiple_WindowPopup = windowpopupscript.window_PopUpModal_MultipleWindowPopUp();		
		
		Assert.assertEquals(multiple_WindowPopup, true, "window not found");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		//browserClose();
	}

}
