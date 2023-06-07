package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BasePage;

public class POM_ActitimeCreateNewLeaveTypePage extends BasePage{
	
	public WebDriver driver;
	
	@FindBy(id = "leaveTypeLightBox_nameField")
	private WebElement leavetypenameTextfield;
	
	@FindBy(xpath = "(//span[.='Create Leave Type'])[2]")
	private WebElement createleavetypeButton;
	
	public POM_ActitimeCreateNewLeaveTypePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createleavetypeMethod() throws InterruptedException
	{
		visibilityofElement(driver, leavetypenameTextfield);
		javascriptHighlight(driver, createleavetypeButton);
		leavetypenameTextfield.sendKeys("travelling2");
		
		visibilityofElement(driver, createleavetypeButton);
		javascriptHighlight(driver, createleavetypeButton);
		javascriptClick(driver, createleavetypeButton);
	}

}
