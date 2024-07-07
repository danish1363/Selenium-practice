package Parllel;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.Driverfactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	LoginPage lp= new LoginPage(Driverfactory.getdriver());
	String PageTitle;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		Driverfactory.getdriver().get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	
	}

	@When("user gets title of the page")
	public void user_gets_title_of_the_page() {
	  
		PageTitle=lp.getloginTitle();
	}
	

      @Then("page title should be {string}")
      public void page_title_should_be(String ExpectedTitle) {
    	  Assert.assertTrue(ExpectedTitle.contains(PageTitle));
    }

	@Then("forgot password link  should be displayed")
	public void forgot_password_link_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	 Assert.assertTrue(lp.isforgotlogindetailexist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		 lp.enterusername(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
	   lp.enterpassword(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
         lp.clickloginbutton();
	}





}
