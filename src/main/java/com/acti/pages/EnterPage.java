package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/*
 * Name: EnterTimePage/Home Page
 * Description: Login page elements and actions
 * Developed By; Deepa
 * Date:23//11/22
 * Reviewed By: shantosh
 */

public class EnterPage extends DriverScript {
	
	//page elements
	
	@FindBy(xpath="//a[@class='userProfileLink username ']") WebElement usernameText;
	@FindBy(id="logoutLink") WebElement logoutLink;

	//page initialization
	
	public EnterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyUserLoggedIn() 
	{
		return usernameText.getText();
	}
	
	public String getEnterPageTitle()
	{
		return driver.getTitle();
	}
	
	public void clickLogout()
	{
		logoutLink.click();
	}
	

}
