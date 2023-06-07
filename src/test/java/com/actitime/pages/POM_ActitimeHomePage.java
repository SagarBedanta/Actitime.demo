package com.actitime.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BasePage;

public class POM_ActitimeHomePage extends BasePage
{
	
	public WebDriver driver;
	
	
	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	@FindBy(id = "container_tasks")
	private WebElement tasksLink;
	
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(id = "container_users")
	private WebElement usersLink;
		
	public POM_ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoutMethod() throws InterruptedException
	{
		visibilityofElement(driver, logoutLink);
		javascriptHighlight(driver, logoutLink);
		javascriptClick(driver, logoutLink);
		driver.quit();
	}
	
	public void tasksMethod() throws InterruptedException
	{
		visibilityofElement(driver, tasksLink);
		javascriptHighlight(driver, tasksLink);
		javascriptClick(driver, tasksLink);
	}
	
	public void settingsMethod() throws InterruptedException
	{
		visibilityofElement(driver, settingsLink);
		javascriptHighlight(driver, settingsLink);
		javascriptClick(driver, settingsLink);
	}
	public void usersMethod() throws InterruptedException
	{
		visibilityofElement(driver, usersLink);
		javascriptHighlight(driver, usersLink);
		javascriptClick(driver, usersLink);
	}
}