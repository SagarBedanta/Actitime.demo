package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BasePage;

public class POM_ActitimeUsersPage extends BasePage{
	public WebDriver driver;
	

	//create customer
	@FindBy(xpath = "//div[.='New User']")
	private WebElement newuserButton;
	
	public POM_ActitimeUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void newuserMethod() throws InterruptedException
	{
		visibilityofElement(driver, newuserButton);
		javascriptHighlight(driver, newuserButton);
		javascriptClick(driver, newuserButton);
	}
	
	
}
