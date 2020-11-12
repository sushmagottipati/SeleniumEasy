package com.seleniumeasy.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.praticeflipkart.browser.Base;
import com.seleniumeasy.pageobjects.DownloadFilePage;

public class DownloadFileScript {
	
	DownloadFilePage downloadfilepage = null;
	
	Base base = new Base();
	
	public DownloadFileScript(WebDriver driver) {
		
		
		downloadfilepage = PageFactory.initElements(driver, DownloadFilePage.class);
	}
	
	public void download_File() {
		
		downloadfilepage.download_File.click();	
	}
	public void verify_FileDownload() {
		
		String path = "C:\\Users\\dell\\Downloads\\sample.txt";
		
		base.verifyFileDownload(path);
	}
	
	public void file_Download() {
		
		//base.windowResize();
		
		downloadfilepage.download_File.click();
		
		//base.windowMaximize();
		
		downloadfilepage.enter_Data.sendKeys("selenium easy site we can automate");
		
		downloadfilepage.generate_File.click();
		
		downloadfilepage.Download.click();
	}
	

}
