package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	
	private WebDriver driver;
	
	By Name= By.xpath("//input[@name='username']");
	
	By Password = By.xpath("//input[@name='password']");
	
	By LogIn= By.xpath("//input[@type='submit']");
	
	By ForgotLoginDetails= By.xpath("//a[text()='Forgot login info?']");
	
	
	public LoginPage(WebDriver driver)
	
	{
		
		this.driver=driver;
	}
	
	
	public String getloginTitle()
	
	{
	return	driver.getTitle();
		
	}
	public boolean isforgotlogindetailexist()
	
	{
		
	 return driver.findElement(ForgotLoginDetails).isDisplayed();
	}
	
	
	public void enterusername(String user)
	
	{
		driver.findElement(Name).sendKeys(user);
		
	}
	
	public void enterpassword(String pass)
	{
		
		driver.findElement(Password).sendKeys(pass);
	}
	
	public void clickloginbutton()
	{
		
		driver.findElement(LogIn).click();
	}
	
	
	
	

}
