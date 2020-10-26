package com.seleniumeasy.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.praticeflipkart.browser.Base;
import com.seleniumeasy.pageobjects.RadioButtonPage;
import com.seleniumeasy.script.DownloadFileScript;
import com.seleniumeasy.script.RadioButtonScript;
import com.seleniumeasy.script.UploadFileScript;
import com.seleniumeasy.script.WindowPopUpScript;

public class DownloadFileTest extends Base{

	DownloadFileScript downloadfilescript = null;

	RadioButtonPage radiobuttonpage = null;

	WindowPopUpScript windowpopupscript = null;

	@BeforeMethod
	public void lunchRequriments() {

		driver = browserLaunch();

		radiobuttonpage = new RadioButtonPage(driver);

		windowpopupscript = new WindowPopUpScript(driver);

		downloadfilescript = new DownloadFileScript(driver);


	}

	@Test
	public void TC_001_uploadFile() {

		//downloadfilescript.download_File();
		
		radiobuttonpage.demoButton();
		
		radiobuttonpage.closeCrossMark();
		
		windowpopupscript.alert_Modals();
		
		downloadfilescript.file_Download();
		
		

	}

	@AfterMethod
	public void tearDown()
	{
		//browserClose();
	}


}
