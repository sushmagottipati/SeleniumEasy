package com.seleniumeasy.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.praticeflipkart.browser.Base;
import com.seleniumeasy.pageobjects.WindowPopUpPage;

public class WindowPopUpScript {

	WindowPopUpPage windowpopuppage = null;

	Base base = new Base();

	public WindowPopUpScript(WebDriver driver) {


		windowpopuppage = PageFactory.initElements(driver, WindowPopUpPage.class);
	}
	public void alert_Modals()
	{
		windowpopuppage.alerts_Modals.click();
	}

	public void window_PopUpModal() {

		windowpopuppage.window_PopUpModal.click();
	}

	public void window_PopUpModal_SinglePopUp_Twitter() {

		windowpopuppage.window_POpUp_SingleWindowPopUp_Twitter.click();

		base.switchTOWindow();

		windowpopuppage.twitter_email.sendKeys("abc@gmail.com");


	}

	public boolean window_PopUpModal_MultipleWindowPopUp() {

		boolean multiple_WindowPopUp = false;

		windowpopuppage.window_PopUp_MultipeWindowPopUp_Twitterandfacebook.click();

		base.switchTOWindow();

		windowpopuppage.twitter_email.sendKeys("abc@gmail.com");

		base.switchTOWindow();
		windowpopuppage.facebook_email.sendKeys("abc@gmail.com");




		return true;




	}

}
