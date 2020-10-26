package com.seleniumeasy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormPage {
	
	WebDriver driver = null;
	
	
	@FindBy(xpath="//a[text()='Demo Website!']")
	public WebElement demo_Button;
	
	
	@FindBy(id="at-cv-lightbox-close")
	public WebElement close_CrossMark;
	
	
	@FindBy(xpath = "//div[@id='navbar-brand-centered']/ul[1]/li[1]/a")
	public WebElement inputforms_button;
	
	
	@FindBy(xpath="//div[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[1]/a")
	public WebElement simpleform_Demo;
	
	
	@FindBy(id = "user-message")
	public WebElement msg_Text;
	
	
	@FindBy(xpath = "//button[text()='Show Message']")
	public WebElement show_Button;
	
	
	@FindBy(id = "display")
	public WebElement dispay_Text;
	
	
	
	@FindBy(id = "sum1")
	public WebElement sum1;
	
	
	@FindBy(id = "sum2")
	public WebElement sum2;
	
	
	@FindBy(xpath = "//button[text()= 'Get Total']")
	public WebElement total_sum;
	
	
	@FindBy(id="displayvalue")
	public WebElement total_display;
	
	
	

	
	
	
			
	 
	
	
	

}
