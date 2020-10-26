package com.seleniumeasy.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage {
	
	@FindBy(xpath="//a[text()='Demo Website!']")
	public WebElement demo_Button;
	
	
	@FindBy(id="at-cv-lightbox-close")
	public WebElement close_CrossMark;
	
	
	@FindBy(xpath = "//div[@id='navbar-brand-centered']/ul[1]/li[1]/a")
	public WebElement inputforms_button;

	
	@FindBy(xpath = "//div[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[2]/a")
	public WebElement checkbox_Demo;
	
	
	@FindBy(id="isAgeSelected")
	public WebElement single_CheckBox;
	
	
	@FindBy(id="txtAge")
	public WebElement checkboxtext_display;
	
	
	@FindBy(xpath="//label[text() ='Option 1']")
	public WebElement check_Box1;
	
	@FindBy(xpath = "//label[text() ='Option 2']")
	public WebElement check_Box2;	
	
	
	@FindBy(xpath = "//label[text() ='Option 3']")
	public WebElement check_Box3;	

	
	@FindBy(xpath = "//label[text() ='Option 4']")
	public WebElement check_Box4;
			
	@FindBy(id="check1")
	public WebElement check_All;
	
	
	
	

}
