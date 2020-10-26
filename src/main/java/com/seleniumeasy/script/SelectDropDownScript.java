package com.seleniumeasy.script;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.praticeflipkart.browser.Base;
import com.praticeflipkart.utilities.XlsReader;
import com.seleniumeasy.pageobjects.SelectDropDownPage;

public class SelectDropDownScript {
	
	
	Base base = new Base();
	
	XlsReader xlsreader = new XlsReader();
	
	SelectDropDownPage selectdropdownpage = null;
	
	public SelectDropDownScript(WebDriver driver)
	{
		selectdropdownpage = PageFactory.initElements(driver, SelectDropDownPage.class);
	}
	
	public void inputformSelectDropDown()
	{
		selectdropdownpage.inputForm_SelectDropDownList.click();

	}
	
	public void selectDropDownValue()
	{
		String dropdown = xlsreader.getCellDataByColumnName("Sheet1", "dropdown", 1);
		
		base.selectDropDownValiueByVisibleText(selectdropdownpage.select_DropDown, dropdown);
		
		
	}
	
	public void deselctValue()
	{
		

		base.selectDropDownDeselectByVisibleText(selectdropdownpage.select_DropDown, "Saturday");
	}
	
	public void multiSelectDropDown()
	{
		String dropdown2 = xlsreader.getCellDataByColumnName("Sheet1", "dropdown", 2);

		base.selectDropDownValiueByVisibleText(selectdropdownpage.multi_SelectDropDown, dropdown2);
		
		String dropdown3 = xlsreader.getCellDataByColumnName("Sheet1", "dropdown", 3);

		base.selectDropDownValiueByVisibleText(selectdropdownpage.multi_SelectDropDown, dropdown3);
		
		String dropdown4 = xlsreader.getCellDataByColumnName("Sheet1", "dropdown", 4);

		base.selectDropDownValiueByVisibleText(selectdropdownpage.multi_SelectDropDown, dropdown4);
		
		String dropdown5 = xlsreader.getCellDataByColumnName("Sheet1", "dropdown", 5);

		base.selectDropDownValiueByVisibleText(selectdropdownpage.multi_SelectDropDown, dropdown5);
	}
	
	public List<WebElement> getAllSelectedOptions()
	{
		List<WebElement> allSelectedOptions = base.selectDropDownGetAllSelectOptions(selectdropdownpage.multi_SelectDropDown);
		
		return allSelectedOptions;
		
	}
	
	
	
	public void deselctAll()
	{
		base.selectDropDownDeselectAll(selectdropdownpage.multi_SelectDropDown);
	}
	
	
	
}
