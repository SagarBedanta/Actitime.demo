package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.POM_ActitimeCreateNewLeaveTypePage;
import com.actitime.pages.POM_ActitimeHomePage;
import com.actitime.pages.POM_ActitimeLeaveTypesPage;
import com.actitime.pages.POM_ActitimeLoginPage;
import com.actitime.pages.POM_ActitimeSettingsPage;

public class TC6_ActitimeCreateLeaveType extends BaseTest
{

	
	@Test (priority = 1)
	public void login() throws InterruptedException, IOException
	{
		POM_ActitimeLoginPage loginPage=new POM_ActitimeLoginPage(driver);
		loginPage.loginMethod();
	}
	
	@Test (priority = 2)
	public void creatework() throws InterruptedException
	{
		POM_ActitimeHomePage homePage=new POM_ActitimeHomePage(driver);
		homePage.settingsMethod();
		
		POM_ActitimeSettingsPage settingsPage=new POM_ActitimeSettingsPage(driver);
		settingsPage.leavetypesMethod();
		
		POM_ActitimeLeaveTypesPage leavetypespage=new POM_ActitimeLeaveTypesPage(driver);
		leavetypespage.leavetypesMethod();
		
		POM_ActitimeCreateNewLeaveTypePage leavetype=new POM_ActitimeCreateNewLeaveTypePage(driver);
		leavetype.createleavetypeMethod();
	}
	@Test (priority = 3)
	public void logout() throws InterruptedException
	{
		POM_ActitimeHomePage homePage=new POM_ActitimeHomePage(driver);
		homePage.logoutMethod();
	}

}
