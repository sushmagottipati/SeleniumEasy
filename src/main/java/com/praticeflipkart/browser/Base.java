package com.praticeflipkart.browser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	WebDriverWait wait;

	Select select = null;



	public WebDriver browserLaunch()
	{

		WebDriverManager.chromedriver().setup();
		
		driver = new  ChromeDriver();

		
		
		//WebDriverManager.firefoxdriver().setup();
		
		//driver = new FirefoxDriver();


		windowMaximize();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


		//driver.get("https://www.seleniumeasy.com/");

		driver.get("https://www.flipkart.com/");
		
		//driver.get("http://demo.guru99.com/test/upload/");
		//driver.get("https://www.google.com/search?q=sample+text+file+to+download&oq=sample+text+file+to+&aqs=chrome.0.0i457j69i57j0i22i30l6.10139j0j7&sourceid=chrome&ie=UTF-8");

		return driver;

	}
	
	public void windowResize() {
	
		Dimension dimension = new Dimension(10000, 10000);
		
		
		
		driver.manage().window().setSize(dimension);
	}
	
	public void windowMaximize() {
		
		driver.manage().window().maximize();

	}
	
	public FirefoxOptions fileDownload_FireFoxBrowser()
	{
		FirefoxProfile firefoxprofile = new FirefoxProfile();
		firefoxprofile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plan,application/pdf");
		firefoxprofile.setPreference("browser.download.manager.showWhenStarting", false);
		firefoxprofile.setPreference("pdfjs.disabled", true);
		
		FirefoxOptions firefoxoptions = new FirefoxOptions();
		firefoxoptions.setProfile(firefoxprofile);
		return firefoxoptions;
	}

	public void waitForElementToBeLocated(WebElement element) {

		wait = new WebDriverWait(driver, Duration.ofSeconds(60), Duration.ofMillis(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
	}

	public void waitForElementToBeClickable(WebElement element) {

		wait = new WebDriverWait(driver, Duration.ofSeconds(60), Duration.ofMillis(5));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitForElementToBeVisible(WebElement element) {

		wait = new WebDriverWait(driver, Duration.ofSeconds(60), Duration.ofMillis(5));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementsToBeVisible(List<WebElement> elements) {

		wait = new WebDriverWait(driver, Duration.ofSeconds(60), Duration.ofMillis(5));
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	public void waitForElementsToBeDisplay(WebElement element) {

		wait = new WebDriverWait(driver, Duration.ofSeconds(60), Duration.ofMillis(5));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}


	public void selectDropDownValiueByVisibleText(WebElement element,String dropDownValue)
	{
		select = new Select(element);
		select.selectByVisibleText(dropDownValue);
	}
	public void selectDropDownValiueByIndex(WebElement element,int value)
	{
		select = new Select(element);
		select.selectByIndex(value);
	}

	public void selectDropDownValiueByValue(WebElement element,String value)
	{
		select = new Select(element);
		select.selectByValue(value);
	}

	public void selectDropDownDeselectAll(WebElement element)
	{
		select = new Select(element);
		select.deselectAll();
	}

	public void selectDropDownDeselectByVisibleText(WebElement element,String value)
	{
		select = new Select(element);
		select.deselectByVisibleText(value);
	}

	public List<WebElement> selectDropDownGetAllSelectOptions(WebElement element)
	{
		select = new Select(element);
		List<WebElement> allSelectOptions = select.getAllSelectedOptions();
		return allSelectOptions;

	}

	public WebElement selectDropDownGetFirstSelectedOption(WebElement element)
	{
		select = new Select(element);
		WebElement allFirstSelectOption = select.getFirstSelectedOption();
		return allFirstSelectOption;

	}

	public List<WebElement> selectDropDownGetOptions(WebElement element)
	{
		select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		return allOptions;

	}



	public void mouseMovement(WebElement element)
	{

		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	public void doubleClickOnElement(WebElement element)
	{

		Actions actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
	}

	public void contextClickOnElement(WebElement element) throws AWTException
	{

		Actions actions = new Actions(driver);
		actions.contextClick(element).build().perform();


		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	public void dragAndDrop(WebElement source,WebElement target)
	{
		Actions actions = new Actions(driver);

		actions.clickAndHold(source).moveToElement(target).release().build().perform();
	}


	public void switchTOWindow()
	{
		String parentWindow_Id = driver.getWindowHandle();

		Set<String> window = driver.getWindowHandles();

		for (String eachwindowid : window) {

			if(!eachwindowid.equalsIgnoreCase(parentWindow_Id))
			{
				driver.switchTo().window(eachwindowid);
			}

		}

	}

	public void switchToAlert_Accept() {

		driver.switchTo().alert().accept();
	}

	public void switchToAlert_Dissmiss() {

		driver.switchTo().alert().dismiss();
	}

	public void switchToAlert_GetText() {

		driver.switchTo().alert().getText();
	}
	
	public void switchToAlert_SendKeys(String name) {

		driver.switchTo().alert().sendKeys(name);
	}




	public void browserClose() {

		driver.close();
	}



}
