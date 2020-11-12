package com.praticeflipkart.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.praticeflipkart.browser.Base;
import com.praticeflipkart.datasets.DataSet_Login;
import com.praticeflipkart.pageobjects.LoginPage;
import com.praticeflipkart.utilities.XlsReader;

public class LoginScript {

	LoginPage loginpage = null;

	XlsReader xlsreader = new XlsReader();
	
	Base base = new Base();



	public  LoginScript(WebDriver driver)

	{

		loginpage = PageFactory.initElements(driver, LoginPage.class);
	}

	public void invalidUsername_ValidPassword_Login() {

		String xlsreader_username = xlsreader.getCellDataByColumnName("Sheet1", "username", 1);

		loginpage.username.sendKeys(xlsreader_username);

		String xlsreader_password = xlsreader.getCellDataByColumnName("Sheet1", "password", 1);

		loginpage.password.sendKeys(xlsreader_password);
		
		
		
		
	}
	public boolean validUsername_invalidPassword_Login() {
		
		boolean title = false;

		String xlsreader_username = xlsreader.getCellDataByColumnName("Sheet1", "username", 2);

		loginpage.username.sendKeys(xlsreader_username);

		String xlsreader_password = xlsreader.getCellDataByColumnName("Sheet1", "password", 2);

		loginpage.password.sendKeys(xlsreader_password);
		
		String  currenttitle = base.getTitle();
		
		if(currenttitle.contains("Online Shopping Site for Mobiles")) {
			
			title = true;
		}else {
			
			title = false;
		}
		
		return title;
			
				
	}
	public void invalidUsername_InvalidPassword_Login() {

		String xlsreader_username = xlsreader.getCellDataByColumnName("Sheet1", "username", 3);

		loginpage.username.sendKeys(xlsreader_username);

		String xlsreader_password = xlsreader.getCellDataByColumnName("Sheet1", "password", 3);

		loginpage.password.sendKeys(xlsreader_password);
	}

	public void validUsername_ValidPassword_Login() {

		String xlsreader_username = xlsreader.getCellDataByColumnName("Sheet1", "username", 4);

		loginpage.username.sendKeys(xlsreader_username);


		//loginpage.username.sendKeys(DataSet_Login.username);

		String xlsreader_password = xlsreader.getCellDataByColumnName("Sheet1", "password", 4);

		System.out.println("password  "      +xlsreader_password);

		loginpage.password.sendKeys(xlsreader_password);

		System.out.println("password  "      +xlsreader_password);

		//loginpage.password.sendKeys(DataSet_Login.password);

	}
	public boolean login_Button()
	{
		loginpage.login_button.click();
		
		return true;

	}
	
	
	
	


}
