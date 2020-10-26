package com.seleniumeasy.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPopUpPage {
	@FindBy(xpath = "//a[text()='Alerts & Modals']")
	public WebElement alerts_Modals;
	
	@FindBy(xpath = "(//a[text()='Window Popup Modal'])[2]")
	public WebElement window_PopUpModal;
	
	@FindBy(xpath = "//a[@href='https://twitter.com/intent/follow?screen_name=seleniumeasy']")
	public WebElement window_POpUp_SingleWindowPopUp_Twitter;
	
	@FindBy(name = "session[username_or_email]")
	public WebElement twitter_email;
	
	@FindBy(xpath = "//a[text()='Follow Twitter & Facebook']")
	public WebElement window_PopUp_MultipeWindowPopUp_Twitterandfacebook;
	
	@FindBy(xpath = "(//input[@id='email'])[1]")
	public WebElement facebook_email;

}
