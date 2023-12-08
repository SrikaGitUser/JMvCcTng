package com.qc.StepDefs;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qc.Utils.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CucAnnot {
	@Before
	public static void setUp() {
		BaseClass.setUpDriver();
	}

	@After
	public static void tearDown(Scenario scenario) {
		// validate if scenario has failed
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
		BaseClass.teardown();
	}
}
