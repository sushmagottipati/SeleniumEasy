package com.seleniumeasy.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.praticeflipkart.browser.Base;
import com.seleniumeasy.pageobjects.DragAndDropPage;

public class DragAndDropScript {
	
	
	DragAndDropPage draganddroppage = null;
	
	Base base = new Base();
	
	
	public DragAndDropScript(WebDriver driver)
	{
		draganddroppage = PageFactory.initElements(driver, DragAndDropPage.class);
		
		
	}
	
	public void dragAndDropElements() throws InterruptedException
	{
		draganddroppage.demosite_ProgressBars.click();
		
		Thread.sleep(3000);
		
		draganddroppage.demosite_ProgressBars_DragAndDrop.click();
		
		Thread.sleep(3000);
	
		base.dragAndDrop(draganddroppage.source, draganddroppage.target);
	}
	
	
	
}
