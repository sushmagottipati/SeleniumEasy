package com.seleniumeasy.script;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.seleniumeasy.pageobjects.TablePage;

public class TableScript {

	TablePage tablepage = null;

	public TableScript(WebDriver driver) {

		tablepage = PageFactory.initElements(driver, TablePage.class);
	}

	public void table()
	{
		tablepage.table.click();

	}

	public void table_TablePagination()
	{

		tablepage.table_TablePagination.click();
	}
	
	public boolean getTableData() {
		
		boolean tabledata = false;

		List<WebElement> testdata = tablepage.table_TablePagination_TableData;
		
		int row_size = tablepage.table_TablePagination_numberofrows.size();
		
		System.out.println("row size     "+row_size);
		
		int col_size = tablepage.table_TablePagination_numberofcolumns.size();
		
		System.out.println("column size "+col_size);
		
		
		int size = testdata.size();
		
		for (int i = 0; i < size; i++) {
			
			System.out.println(testdata.get(i).getText());
			
			
			if(testdata.get(i).getText().equalsIgnoreCase("Table cell")) {
				
				tabledata = true;
			}else
			{
				tabledata = false;
			}
				
		}
		return tabledata;
	}
	





}
