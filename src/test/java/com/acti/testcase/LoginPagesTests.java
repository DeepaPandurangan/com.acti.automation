package com.acti.testcase;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.acti.base.DriverScript;
import com.acti.pages.EnterPage;
import com.acti.pages.LoginPage;

public class LoginPagesTests extends DriverScript{

	
@Test
public void testLoginPageTitle()
{
	initApplication();
	LoginPage lp = new LoginPage();
	String expected = "actiTIME - Login";
	String actual = lp.getLoginPageTitle();
	Assert.assertEquals(actual,expected);
	quitDriver();
}
@Test
public void testActiImageIsDisplayed() 
{
	initApplication();
	LoginPage lp = new LoginPage();
	boolean flag = lp.verifyActiLogo();
	Assert.assertTrue(flag);
	quitDriver();
}
@Test
public void testForgotpasswordIsDisplayed()
{
	initApplication();
	LoginPage lp = new LoginPage();
	 boolean flag = lp.verifyforgotpassword();
	 Assert.assertTrue(flag);
	 quitDriver();
}
@Test
public void testLoginFunction()
{
	initApplication();
	LoginPage lp = new LoginPage();
	lp.enterUsername("admin");
	lp.enterpassword("manager");
	lp.clickLogin();
	EnterPage ep = new EnterPage();
	String expected= "John Doe";
	String actual = ep.verifyUserLoggedIn();
	Assert.assertEquals(actual,expected);
	ep.clickLogout();
	quitDriver();
}













}
