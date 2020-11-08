package com.stepdefinitionsZTT;

import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.BaseClassZTT;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClassZTT {
	@Before
	public void start() {

		System.setProperty("webdriver.chrome.driver", "/Users/Varun/Desktop/WebDriverFolder/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://bbc.co.uk/");
		driver.manage().window().maximize();
	}

	@After
	public void close() {
		driver.close();

	}
}
