package com.praticeflipkart.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsMobilesPage {
	
	@FindBy(xpath ="//span[text()='Electronics']")
	public WebElement electronics;
	
	@FindBy(xpath="//*[@id='container']/div/div[2]/div/div/div/div[1]/a[6]")
	public WebElement electronics_Oppo;
	
	@FindBy(xpath = "//*[text()='OPPO A5s (Black, 32 GB)']")
	public WebElement electronics_Oppo_MobileType;
	
	@FindBy(xpath="//button[text()='ADD TO CART']")     
	public WebElement mobile_AddToCart;
	
}