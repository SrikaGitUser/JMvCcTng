package com.qc.Actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.qc.Locators.TCSLocators;
import com.qc.Utils.BaseClass;

public class TCSActions {
	TCSLocators tcsLocators = null;
	private static Logger logger = LogManager.getLogger();
	Actions actions = new Actions(BaseClass.getDriver());

	public TCSActions() {
		this.tcsLocators = new TCSLocators();
		PageFactory.initElements(BaseClass.getDriver(), tcsLocators);
	}

	public void clickOverview() throws InterruptedException {
		actions.moveToElement(tcsLocators.btnOverview).click().perform();
		logger.info("Click Overview Button");
		Thread.sleep(5000);
	}

	public void clickCompare() throws InterruptedException {
		actions.moveToElement(tcsLocators.btnCompare).click().perform();
		logger.info("Click Compare Button");
		Thread.sleep(5000);
	}

	public void clickFinancials() throws InterruptedException {
		actions.moveToElement(tcsLocators.btnFinancials).click().perform();
		logger.info("Click Financials Button");
		Thread.sleep(5000);
	}
}
