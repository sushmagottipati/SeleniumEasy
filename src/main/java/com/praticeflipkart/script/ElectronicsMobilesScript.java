package com.praticeflipkart.script;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.praticeflipkart.browser.Base;
import com.praticeflipkart.pageobjects.ElectronicsMobilesPage;

public class ElectronicsMobilesScript {

	ElectronicsMobilesPage electronicsmobilepage = null;

	Base base = new Base();



	public ElectronicsMobilesScript(WebDriver driver)
	{


		electronicsmobilepage = PageFactory.initElements(driver, ElectronicsMobilesPage.class );

	}



	public void moveToElement() throws InterruptedException
	{
		Thread.sleep(3000);

		base.mouseMovement(electronicsmobilepage.electronics);

		Thread.sleep(3000);

		electronicsmobilepage.electronics_Oppo.click();

		electronicsmobilepage.electronics_Oppo_MobileType.click();

		/*
		 * String text = electronicsmobilepage.electronics_Oppo_MobileType.getText();
		 * 
		 * System.out.println("text        " +text);
		 * 
		 * String mobile_Name = "OPPO A5s (Black, 32 GB)";
		 */

		Thread.sleep(3000);

		base.switchTOWindow();

		electronicsmobilepage.mobile_AddToCart.click();


		/*
		 * if(text.equalsIgnoreCase(mobile_Name)) {
		 * electronicsmobilepage.mobile_AddToCart.click();
		 * 
		 * System.out.println("success"); }
		 */




		//base.switchTOWindow();

	}

	public void doubleClickOnElement() throws InterruptedException
	{
		Thread.sleep(3000);

		base.mouseMovement(electronicsmobilepage.electronics);

		Thread.sleep(3000);

		base.doubleClickOnElement(electronicsmobilepage.electronics_Oppo);

	}

	public void contextClickOnElement() throws InterruptedException, AWTException
	{
		Thread.sleep(3000);

		base.mouseMovement(electronicsmobilepage.electronics);

		Thread.sleep(3000);

		base.contextClickOnElement(electronicsmobilepage.electronics_Oppo);

			
		Thread.sleep(3000);

		base.switchTOWindow();

	}

}
