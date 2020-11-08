package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/Varun/eclipse-workspace/ZTT/src/test/resources", glue = {
		"com.stepdefinitionsZTT" }, tags = { "@test" }, plugin = { "html:target/cucumber-html-report",
				"json:target/cucumber.json" }, dryRun = false)

public class RunnerZTT {

}
