package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.POM_ActitimeCreateNewProjectPage;
import com.actitime.pages.POM_ActitimeHomePage;
import com.actitime.pages.POM_ActitimeLoginPage;
import com.actitime.pages.POM_ActitimeTasksPage;

public class TC4_ActitimeCreateProjectLogout extends BaseTest 
{
		@Test
		public void login() throws InterruptedException, IOException 
		{
			POM_ActitimeLoginPage loginPage=new POM_ActitimeLoginPage(driver);
			loginPage.loginMethod();	
		}
		@Test (priority = 2)
		public void createproject() throws InterruptedException, IOException 
		{
			POM_ActitimeHomePage homePage=new POM_ActitimeHomePage(driver);
			homePage.tasksMethod();
			
			POM_ActitimeTasksPage tasksPage=new POM_ActitimeTasksPage(driver);
			tasksPage.addnewMethod();
			tasksPage.newprojectMethod();
			
			POM_ActitimeCreateNewProjectPage projectPage=new POM_ActitimeCreateNewProjectPage(driver);
			projectPage.enterprojectMethod();
			projectPage.customertextfieldMethod();
			projectPage.dropdownMethod();
			projectPage.customernameMethod();
			
			projectPage.projectdescriptionMethod();
			projectPage.createprojectMethod();
		}
		
		@Test (priority = 3)
		public void logout() throws InterruptedException
		{
			POM_ActitimeHomePage homePage=new POM_ActitimeHomePage(driver);
			homePage.logoutMethod();
		}
		
		

	}


