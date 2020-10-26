package com.seleniumeasy.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage {
	
	@FindBy(xpath = "//div[@id='navbar-brand-centered']/ul[2]/li[1]/a")
	public WebElement demosite_ProgressBars;
	
	@FindBy(xpath = "//div[@id='navbar-brand-centered']/ul[2]/li[1]/ul/li[3]/a")
	public WebElement demosite_ProgressBars_DragAndDrop;
	
	@FindBy(xpath = "//*[@id='slider3']/div/input")
	public WebElement source;
	
	@FindBy(xpath = "//*[@id='rangeSuccess']")
	public WebElement target;

}
