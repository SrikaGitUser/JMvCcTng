package com.qc.Actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.qc.Locators.BSESensexLocators;
import com.qc.Utils.BaseClass;

public class BSESensexActions {
	BSESensexLocators bseSensexLocators = null;
	private static Logger logger = LogManager.getLogger();

	public BSESensexActions() {
		this.bseSensexLocators = new BSESensexLocators();
		PageFactory.initElements(BaseClass.getDriver(), bseSensexLocators);
	}

	public void clickBSESensexBtn() throws InterruptedException {
		bseSensexLocators.btnBSESensex.click();
		logger.info("Click BSESensex Button");
		Thread.sleep(5000);
	}
}
