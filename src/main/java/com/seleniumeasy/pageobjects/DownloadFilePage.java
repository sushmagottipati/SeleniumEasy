package com.seleniumeasy.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadFilePage {
	@FindBy(xpath = "//span[text()='Download sample.txt - 25.io']")
	public WebElement download_File;
	
	@FindBy(xpath = "(//a[text()='File Download'])[2]")
	public WebElement file_Download;
	
	@FindBy(id = "textbox")
	public WebElement enter_Data;
	
	@FindBy(xpath = "//button[@id='create']")
	public WebElement generate_File;
	
	@FindBy(id = "link-to-download")
	public WebElement Download;

}
