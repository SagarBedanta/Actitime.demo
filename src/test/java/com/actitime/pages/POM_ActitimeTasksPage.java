package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BasePage;

public class POM_ActitimeTasksPage extends BasePage
{
	public WebDriver driver;
	
	//create customer
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnewButton;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newcustomerLink;
	//deletecustomer
	@FindBy(xpath = "(//div[contains(text(),'sagar')])[1]")
	private WebElement clickonsagar;

	@FindBy(xpath = "//div[@title='sagar']/..//div[@class='editButton']")
	private WebElement newcustomersetting;

	@FindBy(xpath = "(//div[@class='action'])[1]")
	private WebElement actionbutton;

	@FindBy(xpath = "(//div[.='Delete'])[2]")
	private WebElement deletebutton;


	@FindBy(xpath = "(//span[@class='submitTitle buttonTitle'])[1]")
	private WebElement deletepermanentlybutton;
	
	//create project
	@FindBy(xpath = "//div[@class='item createNewProject']")
	private WebElement newprojectLink;

	
	public POM_ActitimeTasksPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addnewMethod() throws InterruptedException
	{
		visibilityofElement(driver, addnewButton);
		javascriptHighlight(driver, addnewButton);
		javascriptClick(driver, addnewButton);
	}
	
	public void newcustomerMethod() throws InterruptedException
	{
		visibilityofElement(driver, newcustomerLink);
		javascriptHighlight(driver, newcustomerLink);
		javascriptClick(driver, newcustomerLink);
	}
	
	public void clicksagarMethod() throws InterruptedException
	{
		visibilityofElement(driver, clickonsagar);
		javascriptHighlight(driver, clickonsagar);
		javascriptClick(driver, clickonsagar);
	}
	
	public void settingMethod() throws InterruptedException
	{
		visibilityofElement(driver, newcustomersetting);
		javascriptHighlight(driver, newcustomersetting);
		javascriptClick(driver, newcustomersetting);
		
	}
	
	public void actionMethod() throws InterruptedException
	{
		visibilityofElement(driver, actionbutton);
		javascriptHighlight(driver, actionbutton);
		javascriptClick(driver, actionbutton);
		
	}
	
	public void deleteMethod() throws InterruptedException
	{
		visibilityofElement(driver, deletebutton);
		javascriptHighlight(driver, deletebutton);
		javascriptClick(driver, deletebutton);
		
	}
	
	public void permanentlydeleteMethod() throws InterruptedException
	{
		visibilityofElement(driver, deletepermanentlybutton);
		javascriptHighlight(driver, deletepermanentlybutton);
		javascriptClick(driver, deletepermanentlybutton);
		
	}
	public void newprojectMethod() throws InterruptedException
	{
		visibilityofElement(driver, newprojectLink);
		javascriptHighlight(driver, newprojectLink);
		javascriptClick(driver, newprojectLink);
		
	}
}