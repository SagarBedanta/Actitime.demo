package com.actitime.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;
import com.actitime.generics.Screenshot1;

public class POM_ActitimeLoginPage extends BasePage implements AutoConstant
{
	public WebDriver driver;	
	
	
	@FindBy(id = "username")
	private WebElement usernameTextfield;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;
	
	public POM_ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void loginMethod() throws InterruptedException, IOException
	{
		visibilityofElement(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_login, 1, 0));

		
		visibilityofElement(driver, passwordTextfield);
		passwordTextfield.sendKeys("manager");
		
		visibilityofElement(driver, keepmeloggedinCheckbox);
		javascriptClick(driver, keepmeloggedinCheckbox);
		
		visibilityofElement(driver, loginButton);
		javascriptClick(driver, loginButton);
	}
	public void titlevalidate()
	{
		titleis(driver, "actiTIME - Enter Time-Track");
		validateTitle(driver, "actiTIME - Enter Time-Track");
	}
	
	public void forgotpasswordMethod()
	{
		forgotyourpasswordLink.click();
	}
	
	public void actitimeincMethod()
	{
		actitimeincLink.click();
	}
}