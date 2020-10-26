package com.seleniumeasy.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.praticeflipkart.browser.Base;
import com.praticeflipkart.utilities.XlsReader;
import com.seleniumeasy.pageobjects.UploadFilePage;

public class UploadFileScript {
	
	
	UploadFilePage uploadfilepage = null;
	
	XlsReader xlsreader = new XlsReader();
	
	Base base = new Base();
	
	public UploadFileScript(WebDriver driver) {
		
		
		uploadfilepage = PageFactory.initElements(driver, UploadFilePage.class);
	}
	
	public void upload_File() {
		
		base.windowResize();
		
		 String uploadFile = xlsreader.getCellDataByColumnIndex("uploadfile", 0, 0);
		
		uploadfilepage.upload_File.sendKeys(uploadFile);
		
		base.windowMaximize();
	}

}
