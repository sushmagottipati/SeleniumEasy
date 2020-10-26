package com.praticeflipkart.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
	
	@FindBy(name = "q")
	public WebElement search_Products;
	
	//@FindBy(xpath = "//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement search_button;
	
	
	@FindBy(xpath="//div[@data-id='MOBFV9V96DHYMUHJ']")
	
	//@FindBy(xpath="//div[@data-id='MOBFJHGCZ6GYGNSZ']")
	public WebElement Product_Avaliable;
	
	
	
	
			

}
