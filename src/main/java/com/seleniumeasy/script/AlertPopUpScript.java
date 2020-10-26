package com.seleniumeasy.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.praticeflipkart.browser.Base;
import com.seleniumeasy.pageobjects.AlertPopUpPage;

public class AlertPopUpScript {
	
	AlertPopUpPage alertpopuppage = null;
	
	Base base = new Base();
	
	public AlertPopUpScript(WebDriver driver)
	{
		alertpopuppage = PageFactory.initElements(driver, AlertPopUpPage.class);
	}
	
	public void switchTo_Alert() {
		
		alertpopuppage.alert_Models.click();
		
		alertpopuppage.alert_Models_JavaScriptAlerts.click();
		
	}
	
		public void alert_Box() {
			
		alertpopuppage.alert_Models_JavaScriptAlerts_AlertBox.click();
		
		base.switchToAlert_Accept();
		
		}
		
		public void confirm_Box()
		{
			
		
		alertpopuppage.alert_Models_JavaScriptAlerts_ConfirmBox.click();
		
		base.switchToAlert_Dissmiss();
		
		}
		
		public void prompt_Box() throws InterruptedException {
		
		alertpopuppage.alert_Models_JavaScriptAlerts_PromptBox.click();
		
		Thread.sleep(3000);
		
		base.switchToAlert_SendKeys("SriSushma");
		
		//base.switchToAlert_Accept();
	}
	

}
