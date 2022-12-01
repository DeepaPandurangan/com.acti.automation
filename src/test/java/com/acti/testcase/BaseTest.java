package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.DriverScript;
import com.acti.pages.EnterPage;
import com.acti.pages.LoginPage;

public class BaseTest extends DriverScript {
	LoginPage lp;
	 EnterPage ep;
	
	 @BeforeMethod
	public void setup() 
	{
		initApplication();
		 lp = new LoginPage();
		 EnterPage ep = new EnterPage();
	}
	
	@AfterMethod
	public void teardown()
	{
		quitDriver();
	}

}