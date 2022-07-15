
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class dropPage {

// public WebDriver driver=null;
// public dropPage (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public dropPage (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	






@FindBy(xpath="//input[@class='form-control select-input placeholder-active active']")public WebElement drop1i;



@FindBy(xpath="//span[contains(text(),'Two')]")public WebElement item2;

@FindBy(xpath="//span[contains(text(),'Three')]")public WebElement item3;
//pomStart
	


}
