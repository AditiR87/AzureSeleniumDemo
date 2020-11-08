package com.stepdefinitionsZTT;

import com.runner.BaseClassZTT;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomepageSD extends BaseClassZTT {

	@Given("^I am in HomePage$")
	public void i_am_in_HomePage() {
		homepage.i_am_in_HomePage();

	}

	@When("^I select the iPlayer$")
	public void i_select_the_iPlayer() {
		homepage.i_select_the_iPlayer();

	}

	@When("^I enter \"([^\"]*)\" into search textbox$")
	public void i_enter_into_search_textbox(String search) {
		homepage.i_enter_into_search_textbox(search);

	}

	@When("^I select the TV option under More option in header$")
	public void i_select_the_TV_option_under_More_option_in_header() {
		homepage.i_select_the_TV_option_under_More_option_in_header();
	}
	@When("^I enter \"([^\"]*)\" in search box$")
	public void i_enter_in_search_box(String search1) {
		homepage.i_enter_in_search_box(search1);
		
	}
}
