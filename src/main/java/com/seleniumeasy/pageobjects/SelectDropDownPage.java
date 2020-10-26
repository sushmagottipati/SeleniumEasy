package com.seleniumeasy.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectDropDownPage {
	
	@FindBy(xpath = "//div[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[4]/a")
	public WebElement inputForm_SelectDropDownList;
	
	@FindBy(id="select-demo")
	public WebElement select_DropDown;
	
	@FindBy(id="multi-select")
	public WebElement multi_SelectDropDown;
	
	

}
