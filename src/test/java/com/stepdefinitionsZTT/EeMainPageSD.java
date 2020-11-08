package com.stepdefinitionsZTT;

import java.io.IOException;

import com.runner.BaseClassZTT;

import cucumber.api.java.en.Then;

public class EeMainPageSD extends BaseClassZTT {
	@Then("^check the time for the next episode$")
	public void check_the_time_for_the_next_episode() throws IOException {
		eemainpage.check_the_time_for_the_next_episode();
	}

}
