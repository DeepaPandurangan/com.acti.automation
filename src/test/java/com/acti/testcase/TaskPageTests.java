package com.acti.testcase;

import org.testng.annotations.Test;

public class TaskPageTests extends BaseTest{
	
	@Test (dataProvider ="actilogin")
	public void testCreateCustomer(String username,String password)
	{
		lp.enterUsername(username);
		lp.enterpassword(password);
		lp.clickLogin();
		ep.clickTaskMenu();
		tp.clickAddNewButton();
		tp.clickNewCustomerItem();
		tp.enterCustomerName("TestCustomer");
		tp.enterCustomerDescription("Dummy Customer Created for Testing");
		tp.clickCreateCustomer();
		String successmessage = tp.getSuccessMessage();
		System.out.println(successmessage);
		ep.clickLogout();
	}
	
	
	
	
	
	
	
	
	

}
