package com.seleniumeasy.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class TablePage {
	
	@FindBy(xpath = "//a[text()='Table']")
	public WebElement table;
	
	@FindBy(xpath = "(//a[text()='Table Pagination'])[2]")
	public WebElement table_TablePagination;
	
	@FindAll(@FindBy(xpath = "//table[@class = 'table table-hover']//tbody//tr[*]//td"))
	public List<WebElement> table_TablePagination_TableData;
	
	//number of rows
	@FindAll(@FindBy(xpath = "//table[@class = 'table table-hover']//tbody//tr[*]//td[1]"))
	public List<WebElement> table_TablePagination_numberofrows;
	
	//number of columns
	@FindAll(@FindBy(xpath = "//table[@class = 'table table-hover']//tbody//tr[1]//td"))
	public List<WebElement> table_TablePagination_numberofcolumns;

}
