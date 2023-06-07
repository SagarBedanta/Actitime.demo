package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BasePage;

public class POM_ActitimeAddUsersPage extends BasePage {
	 public WebDriver driver;
	  

		
		@FindBy(xpath = "(//input[@placeholder='First Name'])[3]")
		private WebElement firstnameTextfield;
		
		@FindBy(xpath = "(//input[@placeholder='Last Name'])[3]")
		private WebElement lastnameTextfield;
		
		@FindBy(xpath = "(//input[@placeholder='Email'])[3]")
		private WebElement emailTextfield;
		
		
		@FindBy(xpath = "//div[.='Save & Send Invitation']")
		private WebElement saveButton;
		
		@FindBy(xpath = "(//span[.='Close'])[1]")
		private WebElement closeButton;
		
		public POM_ActitimeAddUsersPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void firstnameMethod() throws InterruptedException 
		{
		
			visibilityofElement(driver, firstnameTextfield);
			javascriptHighlight(driver, firstnameTextfield);
			javascriptEnter(driver, "arguments[0].value='sagar'", firstnameTextfield);
			
		}
		public void lastnameMethod() throws InterruptedException
		{
			
			visibilityofElement(driver, lastnameTextfield);
			javascriptHighlight(driver, lastnameTextfield);
			javascriptEnter(driver, "arguments[0].value='bedanta'", lastnameTextfield);
			
		}
		public void emailMethod() throws InterruptedException
		{
			visibilityofElement(driver, emailTextfield);
			javascriptHighlight(driver, emailTextfield);
			javascriptEnter(driver, "arguments[0].value='bedantasagar@gmail.com'", emailTextfield);
			
		}
		
		
		public void saveMethod() throws InterruptedException {
			visibilityofElement(driver, saveButton);
			javascriptHighlight(driver, saveButton);
			javascriptClick(driver, saveButton);	
		}
		public void closeMethod() throws InterruptedException 
		{
			visibilityofElement(driver, closeButton);
			javascriptHighlight(driver, closeButton);
			javascriptClick(driver, closeButton);	
		
			
			
		}


}
