package com.qc.StepDefs;

import org.openqa.selenium.WebDriver;

import com.qc.Actions.SampleActions;
import com.qc.Actions.TCSActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCSDef {
	WebDriver driver;
	SampleActions sa = new SampleActions();
	TCSActions ta = new TCSActions();

	@Given("I want to check actions on TCS Page")
	public void i_want_to_check_actions_on_tcs_page() throws InterruptedException {
		System.out.println("Inside TCSSharePrice page");
		sa.searchString("TCS Share Price");
		sa.clickSearch();
	}

	@When("I click Overview")
	public void i_click_overview() throws InterruptedException {
		ta.clickOverview();
	}

	@When("I click Financials")
	public void i_click_financials() throws InterruptedException {
		ta.clickFinancials();
	}

	@Then("I click Compare")
	public void i_click_compare() throws InterruptedException {
		ta.clickCompare();
	}

}
