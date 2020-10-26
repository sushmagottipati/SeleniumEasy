package com.praticeflipkart.pageobjects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	public WebElement username;
	
	
	@FindBy(xpath="//input[@type='password']")
	
	public WebElement password;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	
	public WebElement login_button;
	

}
