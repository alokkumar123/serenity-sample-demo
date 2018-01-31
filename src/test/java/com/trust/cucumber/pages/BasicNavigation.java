package com.trust.cucumber.pages;

import org.openqa.selenium.WebDriver;

import jline.internal.Log;

import net.serenitybdd.core.pages.PageObject;

public class BasicNavigation extends PageObject {
	
	public BasicNavigation(WebDriver driver){
		super(driver);
	}
	
	public void navigateToSpashPage() {
		$("//*[contains(text(), 'home')]").click();
//		Assert.assertEquals("[FAILED]: User is not on Platform Availability page!!!", "Platform Availability Home",
//				$("//h3[contains(@class,'title')]").getText());
	}
	
	public void navigateTo() {
		$("//li[text()='Notifications']").click();
		Log.info("Clicked on 'Notifications' link");
		waitABit(1000);
		
		$("//li[text()='Systems']").click();
		Log.info("Clicked on 'Systems' link");
		waitABit(1000);
		
//		$("//li[text()='User Management']").click();
//		waitABit(1000);
//		$("//li[text()='Manage Roles']").click();
//		waitABit(1000);
//		$("//li[text()='Regions']").click();
//		waitABit(1000);
//		$("//li[text()='Change logs']").click();
//		waitABit(1000);
//		$("//li[text()='About']").click();
//		waitABit(1000);
//		$("//li[text()='FAQ']").click();
	}
	
	public void navigateToNotification() {
		waitABit(1000);
		$("//li[text()='Notifications']").click();	
	}

	public void clicks() {
		waitABit(1000);
		$("//span[text()='New Notification']").click();	
	}
	
}
