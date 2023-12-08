package com.qc.Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	private static BaseClass helperClass;

	private static WebDriver driver;
	public final static int TIMEOUT = 5;

	private BaseClass() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver",
				"E:\\Users\\srika\\eclipse-workspace\\JMvCcTng\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.get("https://www.google.com");
	}

	public static void setUpDriver() {

		if (helperClass == null) {

			helperClass = new BaseClass();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void teardown() {

		if (driver != null) {
			driver.close();
			driver.quit();
		}

		helperClass = null;
	}

}
