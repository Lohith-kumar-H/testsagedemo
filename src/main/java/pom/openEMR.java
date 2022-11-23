
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import java.util.List;

import reuseablePackage.feature.AllActions;


public class openEMR {

// public WebDriver driver=null;
// public openEMR (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public openEMR (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	




@FindBy(xpath="//input[@id='authUser']")public WebElement userName;

@FindBy(xpath="//input[@id='clearPass']")public WebElement password;

@FindBy(xpath="//button[@id='login-button']")public WebElement login;

@FindBy(xpath="//iframe[@name='cal']")public WebElement calFrame;

@FindBy(xpath="//div[@id='functions']//a[2]")public WebElement newAppointment;
//pomStart
	


}
