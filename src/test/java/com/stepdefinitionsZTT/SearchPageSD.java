package com.stepdefinitionsZTT;



import com.runner.BaseClassZTT;

import cucumber.api.java.en.When;

public class SearchPageSD extends BaseClassZTT {

	@When("^search page for \"([^\"]*)\" is displayed$")
	public void search_page_for_is_displayed(String search) {
		searchtext.search_page_for_is_displayed(search);
	}

	@When("^I click on first search link$")
	public void i_click_on_first_search_link() {
		searchtext.i_click_on_first_search_link();

	}

}