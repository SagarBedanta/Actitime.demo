package com.actitime.testcases;


import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.POM_ActitimeHomePage;
import com.actitime.pages.POM_ActitimeLoginPage;

public class TC1_ActitimeLoginLogout extends BaseTest{
	@Test 
	public void loginLogout() throws InterruptedException, IOException
	{
		
		
		POM_ActitimeLoginPage loginPage=new POM_ActitimeLoginPage(driver);
		loginPage.loginMethod();
		loginPage.titlevalidate();
		
		
		POM_ActitimeHomePage homePage=new POM_ActitimeHomePage(driver);
		homePage.logoutMethod();
	}

}
