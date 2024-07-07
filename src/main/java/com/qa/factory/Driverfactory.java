package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {

	
 public WebDriver driver;
 
 public static ThreadLocal<WebDriver> tl= new ThreadLocal<>();
 
 public WebDriver initBrowser(String browser)
 {
	 
	 if(browser.equals("chrome"))
		 
	 {
		 
		 WebDriverManager.chromedriver().setup();
		 
		 tl.set(new ChromeDriver());
	 }
	 
	 else if(browser.equals("Firefox"))
			 
		 {
			 
			 WebDriverManager.chromedriver().setup();
			 
			 tl.set(new ChromeDriver());
		 }
	 
	 else
	 {
		 
		 System.out.println("Please pass correct browser value");
		 
		 
	 }
	 
	 getdriver().manage().deleteAllCookies();
	
	 
	 return  getdriver();
	 
 }
 
 public static synchronized WebDriver getdriver()
 
 {
	 
	return tl.get();
	 
	 
 }
 
}
