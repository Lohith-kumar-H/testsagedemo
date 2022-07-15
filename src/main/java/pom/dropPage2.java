
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class dropPage2 {

// public WebDriver driver=null;
// public dropPage2 (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public dropPage2 (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	














@FindBy(xpath="//input[@placeholder='From']")public WebElement from1;

@FindBy(xpath="//input[@id='fromCity']")public WebElement from0;

@FindBy(xpath="//p[contains(text(),'Goa, India')]")public WebElement clickk;



@FindBy(xpath="//input[@placeholder='To']")public WebElement to1;

@FindBy(xpath="//p[text()='Bengaluru International Airport']")public WebElement to2;
//pomStart
	


}
