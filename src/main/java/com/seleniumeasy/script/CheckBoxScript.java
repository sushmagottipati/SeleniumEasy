package com.seleniumeasy.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.seleniumeasy.pageobjects.CheckBoxPage;

public class CheckBoxScript {
	
	CheckBoxPage checkboxpage = null;
	
	public CheckBoxScript(WebDriver driver)
	{
		checkboxpage = PageFactory.initElements(driver, CheckBoxPage.class);
	}
	
	public void checkBoxDemo()
	{
		checkboxpage.demo_Button.click();

		checkboxpage.close_CrossMark.click();

		checkboxpage.inputforms_button.click();
		
		checkboxpage.checkbox_Demo.click();
		
		checkboxpage.single_CheckBox.click();
		
		String text = checkboxpage.checkboxtext_display.getText();
		
		System.out.println(text);
		
		checkboxpage.check_Box1.click();
		
		checkboxpage.check_Box2.click();
		
		checkboxpage.check_Box3.click();
		
		checkboxpage.check_Box4.click();
		
		checkboxpage.check_All.click();
		
		checkboxpage.check_All.click();
	}

}
