package com.actitime.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;

public class POM_ActitimeCreateNewProjectPage extends BasePage implements AutoConstant{
	
	public WebDriver driver;
	
	
	@FindBy(xpath = "(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement enterprojectnameTextfield;
	
	@FindBy(xpath = "//div[@class='emptySelection']")
	private WebElement selectcustomerTextfield;
	
	@FindBy(xpath = "//div[@class='itemRow ']")
	private WebElement newcustomerbutton;

	
	@FindBy(xpath = "//input[@class='newCustomerNameField newCustomer']")
	private WebElement newcustomerTextfield;
	
	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement projectdescriptionTextfield;
	
	@FindBy(xpath = "//div[.='Create Project']")
	private WebElement createprojectButton;
	
	public POM_ActitimeCreateNewProjectPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterprojectMethod() throws InterruptedException, IOException
	{
		visibilityofElement(driver, enterprojectnameTextfield);
	    javascriptHighlight(driver, enterprojectnameTextfield);
		enterprojectnameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_project, 1, 0));
	}
	
	public void customertextfieldMethod() throws InterruptedException
	{
		visibilityofElement(driver, selectcustomerTextfield);
	    javascriptHighlight(driver, selectcustomerTextfield);
	    javascriptClick(driver, selectcustomerTextfield);
	}
	public void dropdownMethod() throws InterruptedException
	{
		visibilityofElement(driver, newcustomerbutton);
	    javascriptHighlight(driver, newcustomerbutton);
	    javascriptClick(driver, newcustomerbutton);
		
	}
	public void customernameMethod() throws InterruptedException, IOException
	{
		visibilityofElement(driver, newcustomerTextfield);
	    javascriptHighlight(driver, newcustomerTextfield);
		newcustomerTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_project, 1, 1));
	}
	public void projectdescriptionMethod() throws InterruptedException, IOException
	{
		visibilityofElement(driver, projectdescriptionTextfield);
	    javascriptHighlight(driver, projectdescriptionTextfield);
		projectdescriptionTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_project, 1, 2));
	}
	public void createprojectMethod() throws InterruptedException
	{
		visibilityofElement(driver, createprojectButton);
	    javascriptHighlight(driver, createprojectButton);
	    javascriptClick(driver, createprojectButton);
		
	}

}
