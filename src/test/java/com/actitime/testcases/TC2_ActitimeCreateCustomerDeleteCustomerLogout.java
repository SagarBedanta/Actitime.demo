package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.POM_ActitimeCreateNewCustomerPage;
import com.actitime.pages.POM_ActitimeHomePage;
import com.actitime.pages.POM_ActitimeLoginPage;
import com.actitime.pages.POM_ActitimeTasksPage;

public class TC2_ActitimeCreateCustomerDeleteCustomerLogout extends BaseTest
{
	@Test
	public void logincreatecustomerlogout() throws InterruptedException, IOException
	{
		POM_ActitimeLoginPage loginPage=new POM_ActitimeLoginPage(driver);
		loginPage.loginMethod();
	}
	//@Test (priority = 2)
	@Test (priority = 2)
	
	public void createscustomer() throws InterruptedException, IOException
	{
		POM_ActitimeHomePage homePage=new POM_ActitimeHomePage(driver);
		homePage.tasksMethod();
		
		POM_ActitimeTasksPage tasksPage=new POM_ActitimeTasksPage(driver);
		tasksPage.addnewMethod();
		tasksPage.newcustomerMethod();
		
		POM_ActitimeCreateNewCustomerPage customerPage=new POM_ActitimeCreateNewCustomerPage(driver);
		customerPage.entercustomernameMethod();
		customerPage.createcustomerMethod();
	}
	
	@Test (priority = 3)
	public void deletecustomer() throws InterruptedException
	{
		POM_ActitimeTasksPage tasksPage=new POM_ActitimeTasksPage(driver);
		tasksPage.clicksagarMethod();
		tasksPage.settingMethod();
		tasksPage.actionMethod();
		tasksPage.deleteMethod();
		tasksPage.permanentlydeleteMethod();
	}
	
	@Test (priority = 4)
	public void logout() throws InterruptedException
	{
		POM_ActitimeHomePage homePage=new POM_ActitimeHomePage(driver);
		homePage.logoutMethod();
	}
	
	

}