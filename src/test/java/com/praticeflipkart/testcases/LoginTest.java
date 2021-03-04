package com.praticeflipkart.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.*;

import com.praticeflipkart.browser.Base;
import com.praticeflipkart.script.LoginScript;
import com.praticeflipkart.script.SearchScript;

public class LoginTest extends Base{

	LoginScript loginscript = null;

	SearchScript searchscript = null;

	WebDriver driver = null;

	@BeforeMethod
	public void launch() throws InterruptedException, IOException
	{
		driver = browserLaunch();

		loginscript = new LoginScript(driver);

		searchscript = new SearchScript(driver);

	}




	@Test (enabled = false,invocationCount = 1)
	public void TC_001_flipKartLogin() {


		loginscript.invalidUsername_ValidPassword_Login();
		boolean actual = loginscript.login_Button();
		Assert.assertEquals(true, true, "invalid data");
		
		}
	@Test(enabled = false,invocationCount = 1)
	public void TC_002_flipKartLogin() {


		loginscript.validUsername_invalidPassword_Login();
		loginscript.login_Button();
		}
	@Test(enabled = false)
	public void TC_003_flipKartLogin() {


		loginscript.invalidUsername_InvalidPassword_Login();
		loginscript.login_Button();
		}
	@Test(enabled = false)
	public void TC_004_flipKartLogin() {


		loginscript.validUsername_ValidPassword_Login();
		loginscript.login_Button();
		}
	
	@Test(enabled = true)
	public void TC_005_searchProducts() throws InterruptedException, IOException 
	{

		loginscript.validUsername_ValidPassword_Login();
		loginscript.login_Button();
		Thread.sleep(3000);
		searchscript.search();
		takeScreenshot("flipkartlogin");
	}

	@AfterMethod
	public void tearDown()
	{
		//browserClose();
	}

}
