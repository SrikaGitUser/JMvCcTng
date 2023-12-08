package com.qc.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleLocators {

	WebDriver driver;

	public SampleLocators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//textarea[@title='Search']")
	public WebElement txtAreaSearch;

	@FindBy(xpath = "//input[@value='Google Search']")
	public WebElement btnSearch;

	@FindBy(xpath = "//span[@class='IsqQVc NprOob wT3VGc']")
	public WebElement strSearchValue;

}
