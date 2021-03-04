package com.seleniumeasy.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.praticeflipkart.browser.Base;
import com.seleniumeasy.pageobjects.RadioButtonPage;
import com.seleniumeasy.script.AlertPopUpScript;
import com.seleniumeasy.script.TableScript;



public class TableTest extends Base{

	WebDriver driver = null;

	RadioButtonPage radiobuttonpage = null;

	TableScript tablescript = null;

	@BeforeMethod
	public void launch() throws InterruptedException, IOException
	{
		driver = browserLaunch();

		radiobuttonpage = new RadioButtonPage(driver);

		tablescript = new TableScript(driver);

	}
	@Test
	public void TC_001_tablePagination()
	{
		radiobuttonpage.demoButton();

		radiobuttonpage.closeCrossMark();

		tablescript.table();

		tablescript.table_TablePagination();

		boolean actualoutput = tablescript.getTableData();

		Assert.assertEquals(actualoutput, true, "table cell value didnot match");
	}

	@AfterMethod
	public void tearDown()
	{
		//browserClose();
	}

}
