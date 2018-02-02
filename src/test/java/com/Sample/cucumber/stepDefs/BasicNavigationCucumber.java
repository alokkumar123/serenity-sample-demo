package com.Sample.cucumber.stepDefs;

import com.Sample.cucumber.steps.BasicNavigatioSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import net.thucydides.core.util.SystemEnvironmentVariables;

public class BasicNavigationCucumber {
	
	@net.thucydides.core.annotations.Steps
	BasicNavigatioSteps stp;

	@Given("^User is on Home Page$")
	public void navigateToSpashPage(){
		System.out.println(" splash page");
		stp.navigateToSpashPage();	
	}

	@And("^Navigate to pages$")
	public void naigateTo() {
		stp.navigateTo();
	}

	/*@And("^Navigate to notifications$")
	public void navigateToNotification() {
		stp.navigateToNotification();
	}

	@When("^Clicks new notification$")
	public void clicks() throws InterruptedException {
		stp.clicks();
	}
*/
}
