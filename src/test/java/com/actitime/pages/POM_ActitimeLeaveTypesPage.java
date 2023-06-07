package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BasePage;

public class POM_ActitimeLeaveTypesPage extends BasePage
{
	public WebDriver driver;
	
	@FindBy(xpath = "//span[.='Create Leave Type']")
	private WebElement createleavetypesButton;
	
	public POM_ActitimeLeaveTypesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void leavetypesMethod() throws InterruptedException
	{
		visibilityofElement(driver, createleavetypesButton);
		javascriptHighlight(driver, createleavetypesButton);
		javascriptClick(driver, createleavetypesButton);
	}
	
	

}
