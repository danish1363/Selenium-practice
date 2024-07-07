package Parllel;


import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.Driverfactory;
import com.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	
	private Driverfactory driverfact;
	
	private WebDriver driver;
	
	private ConfigReader configreader;
	
	Properties prop;
	
	@Before(order=0)
	public void getproperty()
	{
		
		
		configreader= new ConfigReader();
		
		try {
			prop  =	configreader.init_prop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	@Before(order=1)
	public void LaunchBrowser()
	
	{
		
		
		
	String browser=	prop.getProperty("browser");
	driverfact = new  Driverfactory();
	
	
  driver=	driverfact.initBrowser(browser);
		
		
		
	}
	
	@After(order=0)
	
	public void quitbrowser()
	{
		driver.quit();
		
	}
	
	@After(order=1)
	
	public void teardown (Scenario scenerio)
	{
		if(scenerio.isFailed())
		{
		
		String ScreenshotName=scenerio.getName().replaceAll(" ", "");
		
		byte[]  source=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenerio.attach(source, "image/png", ScreenshotName);
		
	}

		
}
}	
