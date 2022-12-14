package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.base.DriverScript;

/*
 * Name: TaskPage
 * Description: Task page elements and actions
 * Developed By; Deepa
 * Date:29//11/22
 * Reviewed By: shantosh
 */

       public class TaskPage extends DriverScript{

	//page elements
    	 
	 @FindBy(xpath="//div[text()='Add New']") WebElement addNewButton;
	 @FindBy(xpath="//div[text()='+ New Customer']") WebElement newCustomerItem;	
	 @FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]") WebElement customernameTextBox;
	 @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement customerdescriptionTextarea;
	 @FindBy(xpath="//div[text()='Create Customer']") WebElement createcustomerButton;
	 @FindBy(xpath="//span[@class='innerHtml']") WebElement successMessage;
	  
	 
	 //page initialization
	
	    public TaskPage()
		{
			PageFactory.initElements(driver, this);
		}
	
	//page Method/Actions
	    
	    public void clickAddNewButton() 
	    {
	    	addNewButton.click();
	    }
	
	    public void clickNewCustomerItem()
	    {
	    	newCustomerItem.click();
	    }
	
	    public void enterCustomerName(String customername)
	    {
	    	
			customernameTextBox.sendKeys(customername);
			
	    }
	
	    public void enterCustomerDescription(String custdesc) 
	    {
	    	customerdescriptionTextarea.sendKeys(custdesc);
	    }
	
	    public void clickCreateCustomer() 
	    {
	    	createcustomerButton.click();
	    }
	    
	    public String getSuccessMessage() 
	    {
	    	return successMessage.getText();
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	
	
	
	
	
	
}
