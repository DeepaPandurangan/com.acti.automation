package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.base.DriverScript;
import com.acti.pages.EnterPage;
import com.acti.pages.LoginPage;

public class LoginPagesTests extends BaseTest {
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

	@Test
	public void testLoginPageTitle() 
	{
		String expected = "actiTIME - Login";
		String actual = lp.getLoginPageTitle();
		Assert.assertEquals(actual, expected);
    }

	@Test
	public void testActiImageIsDisplayed()
     {
        boolean flag = lp.verifyActiLogo();
		Assert.assertTrue(flag);
      }

	@Test
	public void testForgotpasswordIsDisplayed() 
	{
        boolean flag = lp.verifyforgotpassword();
		Assert.assertTrue(flag);
      }

	@Test
	public void testLoginFunction() 
	{
        lp.enterUsername("admin");
		lp.enterpassword("manager");
		lp.clickLogin();
		String expected = "John Doe";
		String actual = ep.verifyUserLoggedIn();
		Assert.assertEquals(actual, expected);
		ep.clickLogout();
	}
	

}
