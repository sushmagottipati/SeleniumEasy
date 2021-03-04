package com.seleniumeasy.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.praticeflipkart.browser.Base;
import com.seleniumeasy.script.UploadFileScript;

public class UploadFileTest extends Base {
	
	UploadFileScript uploadfilescript = null;
	
	@BeforeMethod
	public void lunchRequriments() throws IOException {
		
		driver = browserLaunch();
		
		 uploadfilescript = new UploadFileScript(driver);
		
		
	}
	
	@Test
	public void TC_001_uploadFile() {
		
		uploadfilescript.upload_File();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//browserClose();
	}
	

	
	
}
