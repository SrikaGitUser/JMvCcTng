package com.qc.StepDefs;

import com.qc.Actions.SampleActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleDef {

	// This is a first StepDefinition file of this project
	SampleActions sa = new SampleActions();

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("Inside Given");

	}

	@When("I complete action")
	public void i_complete_action() throws InterruptedException {
		System.out.println("Inside When");
		sa.searchString("TCS Share Price");
		sa.clickSearch();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() throws InterruptedException {
		System.out.println("Inside Then");
		sa.printSearchResult();
		Thread.sleep(5000);
	}

}
