package com.Sample.cucumber.steps;

import com.Sample.cucumber.pages.BasicNavigation;

import io.restassured.RestAssured;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class BasicNavigatioSteps {

	BasicNavigation bn;
   
	@Step
	public void navigateToSpashPage() {
		bn.navigateToSpashPage();
		
	}
     
	
	@Step
	public void navigateTo() {
		bn.navigateTo();
		
	}

	/*public void navigateToNotification() {
		bn.navigateToNotification();
	}

	public void clicks() {
		bn.clicks();
	}*/

}
