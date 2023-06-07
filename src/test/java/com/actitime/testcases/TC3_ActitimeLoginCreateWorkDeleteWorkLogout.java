package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.POM_ActitimeCreateNewTypeOfWork;
import com.actitime.pages.POM_ActitimeHomePage;
import com.actitime.pages.POM_ActitimeLoginPage;
import com.actitime.pages.POM_ActitimeSettingsPage;
import com.actitime.pages.POM_ActitimeTypesOfWorkPage;

public class TC3_ActitimeLoginCreateWorkDeleteWorkLogout extends BaseTest
{
	
	
	@Test (priority = 1)
	public void login() throws InterruptedException, IOException
	{
		POM_ActitimeLoginPage loginPage=new POM_ActitimeLoginPage(driver);
		loginPage.loginMethod();
	}
	
	@Test (priority = 2)
	public void creatework() throws InterruptedException, IOException
	{
		POM_ActitimeHomePage homePage=new POM_ActitimeHomePage(driver);
		homePage.settingsMethod();
		
		POM_ActitimeSettingsPage settingsPage=new POM_ActitimeSettingsPage(driver);
		settingsPage.typesofworkMethod();
		
		POM_ActitimeTypesOfWorkPage typesOfWorkPage=new POM_ActitimeTypesOfWorkPage(driver);
		typesOfWorkPage.createtypeofworkMethod();
		
		POM_ActitimeCreateNewTypeOfWork newTypeOfWork=new POM_ActitimeCreateNewTypeOfWork(driver);
		newTypeOfWork.createworkMethod();
	}
	
	@Test (priority = 3)
	public void deletework() throws InterruptedException
	{
		POM_ActitimeTypesOfWorkPage typesOfWorkPage=new POM_ActitimeTypesOfWorkPage(driver);
		typesOfWorkPage.deleteworkMethod();
	}
	
	@Test (priority = 4)
	public void logout() throws InterruptedException
	{
		POM_ActitimeHomePage homePage=new POM_ActitimeHomePage(driver);
		homePage.logoutMethod();
	}
}