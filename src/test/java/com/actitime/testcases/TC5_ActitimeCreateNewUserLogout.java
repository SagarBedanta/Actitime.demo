package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.POM_ActitimeAddUsersPage;
import com.actitime.pages.POM_ActitimeHomePage;
import com.actitime.pages.POM_ActitimeLoginPage;
import com.actitime.pages.POM_ActitimeUsersPage;

public class TC5_ActitimeCreateNewUserLogout extends BaseTest
    {
	
	@Test
	public void login() throws InterruptedException, IOException 
	{
		POM_ActitimeLoginPage loginPage=new POM_ActitimeLoginPage(driver);
		loginPage.loginMethod();
		
		
	}
	@Test (priority = 2)
	public void addusers() throws InterruptedException 
	{
		POM_ActitimeHomePage homePage=new POM_ActitimeHomePage(driver);
		homePage.usersMethod();
		
		POM_ActitimeUsersPage usersPage=new POM_ActitimeUsersPage(driver);
		usersPage.newuserMethod();
		
		
		POM_ActitimeAddUsersPage adduserPage=new POM_ActitimeAddUsersPage(driver);
		adduserPage.firstnameMethod();
		adduserPage.lastnameMethod();
		adduserPage.emailMethod();
		adduserPage.saveMethod();
		//adduserPage.closeMethod();	
	}
	
	@Test (priority = 3)
	public void logout() throws InterruptedException
	{
		POM_ActitimeHomePage homePage=new POM_ActitimeHomePage(driver);
		homePage.logoutMethod();
	}
}
