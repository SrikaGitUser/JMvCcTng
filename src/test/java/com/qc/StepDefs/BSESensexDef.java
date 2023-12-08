package com.qc.StepDefs;

import org.openqa.selenium.WebDriver;

import com.qc.Actions.BSESensexActions;
import com.qc.Actions.SampleActions;
import com.qc.Actions.TCSActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BSESensexDef {

	WebDriver driver;
	SampleActions sa = new SampleActions();
	TCSActions ta = new TCSActions();
	BSESensexActions ba = new BSESensexActions();

	@Given("I want to check actions on BSE sensex  Page")
	public void i_want_to_check_actions_on_bse_sensex_page() throws InterruptedException {
		sa.searchString("TCS Share Price");
		sa.clickSearch();
		ta.clickCompare();
		System.out.println("On Compare page");
	}

	@When("I click BSE sensex link")
	public void i_click_bse_sensex_link() throws InterruptedException {
		ba.clickBSESensexBtn();
	}

	@Then("I print success")
	public void i_print_success() {
		System.out.println("On BSE sensex page");
	}
}
