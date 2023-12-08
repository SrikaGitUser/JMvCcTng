package com.qc.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TCSLocators {

	@FindBy(xpath = "//span[text()='Compare']")
	public WebElement btnCompare;

	@FindBy(xpath = "//*[text()='Overview']")
	public WebElement btnOverview;

	@FindBy(xpath = "//span[text()='Financials']")
	public WebElement btnFinancials;

}
