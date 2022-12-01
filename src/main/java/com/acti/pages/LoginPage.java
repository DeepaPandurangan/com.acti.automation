package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;
/*
 * Name: LoginPage
 * Description : Login page elements and actions
 * Developed By: Deepa
 * Date: 11/23/22
 * Reviewed By: Shantosh
 */
public class LoginPage extends DriverScript
{

//page elements
	
	@FindBy(id="username") WebElement usernameTextbox;
	@FindBy(name="pwd") WebElement passwordTextbox;
	@FindBy(xpath="//div[text()='Login ']") WebElement LoginButton;
	@FindBy(linkText="Forgot your password?") WebElement forgotPasswordLink;
	@FindBy(className="atLogoImg") WebElement actiImg;
	
	//page initialization
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

//page method/actions
	
	public void enterUsername(String username) 
	{
		usernameTextbox.sendKeys(username);
	}

  public void enterpassword(String password)
  {
	  passwordTextbox.sendKeys(password);
  }

public void clickLogin() 
{
	LoginButton.click();
}

public boolean verifyforgotpassword()
{
	return forgotPasswordLink.isDisplayed();
}

public boolean verifyActiLogo()
{
	return actiImg.isDisplayed();
}

public String getLoginPageTitle() 
{
	return driver.getTitle();
}













}


