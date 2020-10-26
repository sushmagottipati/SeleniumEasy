package com.seleniumeasy.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.seleniumeasy.pageobjects.RadioButtonPage1;

public class RadioButtonScript {
	
	RadioButtonPage1 radiobuttonpage1 = null;
	
	public RadioButtonScript(WebDriver driver)
	{
		radiobuttonpage1 = PageFactory.initElements(driver, RadioButtonPage1.class);
	}
	
	public void clickOnGender()
	{
		radiobuttonpage1.click_OnGender.click();
		
	}
	
	public void age()
	{
		radiobuttonpage1.age.click();
	}
	
	public void getValues()
	{
		radiobuttonpage1.get_Values.click();
	}
	
	public void getValuesDispay()
	{
		String text = radiobuttonpage1.get_ValuesDisplay.getText();
		
		System.out.println(text);
	}
	
	
	

}
