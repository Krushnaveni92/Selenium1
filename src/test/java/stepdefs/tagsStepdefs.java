package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tagsStepdefs {
	@Before(value="@RegressionTest",order=1)
	public void setupscenario() {
		System.out.println("beforescenario");
	}
	@Before(value="@RegressionTest",order=2)
	public void setupstep() {
		System.out.println("beforetest");
	}
	
	@Given("User is on Login Page")
	public void user_is_on_Login_Page() {
		System.out.println("background");
	}

	@When("User Enter Invalid Credentials")
	public void user_Enter_Invalid_Credentials() {
	   
	}

	@When("User is on Task Page")
	public void user_is_on_Task_Page() {
	   
	}

	@When("User is on Deal Page")
	public void user_is_on_Deal_Page() {
	   
	}

	@When("User is on Contact Page")
	public void user_is_on_Contact_Page() {
	    
	}

	@When("User is on Company Page")
	public void user_is_on_Company_Page() {
	    
	}

	@When("User click Logout")
	public void user_click_Logout() {
	    
	}
	
	@Given("User Search Java Text")
	public void user_Search_Java_Text() {
	    
	}

	@Given("User Search Selenium Text")
	public void user_Search_Selenium_Text() {
	   
	}

	@Given("User Search Cucumber Text")
	public void user_Search_Cucumber_Text() {
	   
	}
	@Then("should dispaly Selenium Text")
	public void should_dispaly_Selenium_Text() {
	   
	}
/*	@AfterStep
	public void teardownstep() {
		System.out.println("Teardownstep");
	}
	@After
	public void teardownscenario() {
		System.out.println("Teardownscenaario");
	}*/

}
