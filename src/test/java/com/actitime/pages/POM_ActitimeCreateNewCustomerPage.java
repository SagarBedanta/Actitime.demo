package com.actitime.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;

public class POM_ActitimeCreateNewCustomerPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernameTextfield;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcustomerButton;
	
	public POM_ActitimeCreateNewCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void entercustomernameMethod() throws IOException, InterruptedException
	{
		visibilityofElement(driver, entercustomernameTextfield);
		javascriptHighlight(driver, entercustomernameTextfield);
		javascriptClick(driver, entercustomernameTextfield);
		entercustomernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_customer, 1, 0));
		
	
	}
	
	public void createcustomerMethod() throws InterruptedException
	{
		visibilityofElement(driver, createcustomerButton);
		javascriptHighlight(driver, createcustomerButton);
		javascriptClick(driver, createcustomerButton);
		Thread.sleep(3000);
	}
}