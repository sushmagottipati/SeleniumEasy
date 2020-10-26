package com.seleniumeasy.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage1 {
	
	@FindBy(xpath = "//input[@Value='Female' and @name='gender']")
	public WebElement click_OnGender;
	
	
	@FindBy(xpath = "//input[@value='15 - 50']")
	public WebElement age;
	
	
	@FindBy(xpath = "//button[text()='Get values']")
	public WebElement get_Values;
	
	
	@FindBy(css = "p.groupradiobutton")
	public WebElement get_ValuesDisplay;

}
