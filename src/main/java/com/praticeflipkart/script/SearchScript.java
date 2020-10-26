package com.praticeflipkart.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.praticeflipkart.browser.Base;
import com.praticeflipkart.pageobjects.SearchPage;

public class SearchScript {
	
	SearchPage searchpage = null;
	
	Base base = new Base();
	
	public SearchScript(WebDriver driver)
	{
		 
		searchpage = PageFactory.initElements(driver, SearchPage.class);
	}
	
	public void search() throws InterruptedException {
		
		//base.waitForElementToBeLocated(searchpage.search_Products);
		//base.waitForElementToBeVisible(searchpage.search_Products);
		//base.waitForElementToBeClickable(searchpage.search_Products);
		//base.waitForElementsToBeDisplay(searchpage.search_Products);
		
		
		//Thread.sleep(3000);
		
		searchpage.search_Products.sendKeys("mobile");
		
		//base.waitForElementToBeVisible(searchpage.search_button);

		
		searchpage.search_button.click();
		
		String  ProductName = searchpage.Product_Avaliable.getText();
		
		System.out.println(ProductName);
	}

	
}
