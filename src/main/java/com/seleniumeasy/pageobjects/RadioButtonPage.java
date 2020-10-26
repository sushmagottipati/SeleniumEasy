package com.seleniumeasy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {

	public RadioButtonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[text()='Demo Website!']") 
	private WebElement demo_Button;


	@FindBy(id="at-cv-lightbox-close")
	private WebElement close_CrossMark;


	@FindBy(xpath = "//div[@id='navbar-brand-centered']/ul[1]/li[1]/a")
	private WebElement inputforms_button;

	@FindBy(xpath = "//*[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[3]/a")
	private WebElement radio_ButtonDemo;

	@FindBy(xpath="//input[@value='Female' and @name='optradio']")
	private WebElement radio_Button1;

	@FindBy(id="buttoncheck")
	private WebElement get_CheckedValue;

	@FindBy(css = "p.radiobutton")
	private WebElement radio_ButtonDisplay;

	
	public void demoButton()
	{
		demo_Button.click();
	}

	public void closeCrossMark()
	{
		close_CrossMark.click();
	}

	public void inputFormsButton() throws InterruptedException
	{
		//Thread.sleep(3000);
		inputforms_button.click();
	}

	public void radioButtonDemo()
	{
		radio_ButtonDemo.click();
	}

	public void radioButton1()
	{
		radio_Button1.click();
	}

	public void get_CheckedValue()
	{
		get_CheckedValue.click();
	}
	public void radioButtonDisplay()
	{
		String text = radio_ButtonDisplay.getText();

		System.out.println(text);
	}




}
