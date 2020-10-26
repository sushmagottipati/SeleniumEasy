package com.seleniumeasy.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPopUpPage {
	
	@FindBy(xpath = "//a[text()='Alerts & Modals']")
	public WebElement alert_Models;
	
	@FindBy(xpath = "(//a[text()='Javascript Alerts'])[2]")
	public WebElement alert_Models_JavaScriptAlerts;
	
	@FindBy(xpath = "(//button[text()='Click me!'])[1]")
	public WebElement alert_Models_JavaScriptAlerts_AlertBox;
	
	@FindBy(xpath = "(//button[text()='Click me!'])[2]")
	public WebElement alert_Models_JavaScriptAlerts_ConfirmBox;
	
	@FindBy(xpath = "//button[text()='Click for Prompt Box']")
	public WebElement alert_Models_JavaScriptAlerts_PromptBox;
	

}
