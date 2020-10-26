package com.seleniumeasy.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.praticeflipkart.utilities.XlsReader;
import com.seleniumeasy.pageobjects.SimpleFormPage;

public class SimpleFormScript {

	SimpleFormPage simpleformpage = null;

	XlsReader xlsreader = new XlsReader();

	public SimpleFormScript(WebDriver driver) {

		simpleformpage = PageFactory.initElements(driver, SimpleFormPage.class);
		
		
	}


	public void sampleFormDemo()
	{
		simpleformpage.demo_Button.click();

		simpleformpage.close_CrossMark.click();

		simpleformpage.inputforms_button.click();
		
		simpleformpage.simpleform_Demo.click();
		
		String message = xlsreader.getCellDataByColumnName("Sheet1", "message", 1);
		
		simpleformpage.msg_Text.sendKeys(message);

		simpleformpage.show_Button.click();

		String text = simpleformpage.dispay_Text.getText();

		System.out.println(text);

		simpleformpage.sum1.sendKeys("12");

		simpleformpage.sum2.sendKeys("12");

		simpleformpage.total_sum.click();

		String value = simpleformpage.total_display.getText();

		System.out.println(value);



	}

	/*
	 * public void sampleForDemo1() {
	 * 
	 * demopage.sum1.sendKeys("12");
	 * 
	 * demopage.sum2.sendKeys("12");
	 * 
	 * demopage.total_sum.click();
	 * 
	 * String value = demopage.total_display.getText();
	 * 
	 * System.out.println(value);
	 * 
	 * 
	 * 
	 * }
	 */

}
