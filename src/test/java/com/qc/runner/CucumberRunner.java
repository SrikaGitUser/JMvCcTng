package com.qc.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@TCSScen", features = { "src/test/resources/Features/Sample.feature",
		"src/test/resources/Features/TCS.feature", "src/test/resources/Features/BSESensex.feature" }, glue = {
				"com.qc.StepDefs" }, plugin = { "pretty", "html:target/cucumber-reports.html" })
public class CucumberRunner extends AbstractTestNGCucumberTests {
}