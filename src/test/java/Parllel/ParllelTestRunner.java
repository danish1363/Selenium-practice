package Parllel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;




@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/parllel" }, glue = { "Parllel",
		"AppHooks" },
monochrome = true, 
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class ParllelTestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	
	public Object [][] scenarios()
	
	
	{
		
		return super.scenarios();
		
	}

}
