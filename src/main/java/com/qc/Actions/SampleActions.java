package com.qc.Actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qc.Locators.SampleLocators;
import com.qc.Utils.BaseClass;

public class SampleActions {
	SampleLocators sampleLocators = null;
	private static Logger logger = LogManager.getLogger();
	WebDriver driver;

	public SampleActions() {
//		this.driver = driver;
		this.sampleLocators = new SampleLocators(driver);
		PageFactory.initElements(BaseClass.getDriver(), sampleLocators);
	}

	public void searchString(String s) throws InterruptedException {
		sampleLocators.txtAreaSearch.sendKeys(s);
//		Thread.sleep(5000);
		logger.info("Enter Search Text");
	}

	public void clickSearch() {
		sampleLocators.btnSearch.click();
		logger.info("Click Search Button");
	}

	public void printSearchResult() {
		System.out.println(sampleLocators.strSearchValue.getText());
		logger.info("Print Search Value");
	}
}
