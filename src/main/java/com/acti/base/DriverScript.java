package com.acti.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*
 * class:DriverScript
 * Description: This class is responsible for loading the properties file and loading the application
 * Developed By: Deepa
 * Date: 11/23/22
 * Reviewed By : Shanthosh
 */

public class DriverScript {

	public static WebDriver driver;
	static Properties prop;

	public DriverScript()
	{
		try 
		{
			File file = new File("./atconfig/config.properties");
			//File file = new File("/Users/deepa/eclipse-workspace/com.qa.actitime/atconfig/config.properties");

			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
          } 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("unable to load the properties file please check " + e.getMessage());
		}
	}
   
	public void initApplication()
	{
		String browser = prop.getProperty("browser");
	
                if (browser.equalsIgnoreCase("chrome"))
                {
                	System.setProperty("webdriver.chrome.driver", "./atbrowser/chromedriver");
                	driver = new ChromeDriver();
                }
                else if (browser.equalsIgnoreCase("firefox"))
                {
                	System.setProperty("webdriver.gecko.driver", "./atbrowser/geckodriver");
                	driver=new FirefoxDriver();
                }
                else if(browser.equalsIgnoreCase("edge"))
                {
                	System.setProperty("webdriver.edge.driver", "./atbrowser/msedgedriver");
                	driver=new EdgeDriver();
                }
                else
                {
                	System.err.println("The browser parameter is not supported please check the config file");
                }
                 driver.manage().deleteAllCookies();
                driver.manage().window().maximize();
                driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
                 getURL();
               
              }
                public static void getURL() 
              {
            	  String url = prop.getProperty("url");
            	  driver.get(url);
              }	  
              
	            public void quitDriver()
	            {
	            	driver.close();
	            }

}
