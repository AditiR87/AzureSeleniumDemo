package com.stepdefinitionsZTT;

import com.runner.BaseClassZTT;

import cucumber.api.java.en.When;

public class IplayerSD extends BaseClassZTT {

	@When("^iplayer page is opened$")
	public void iplayer_page_is_opened() {
		iplayer.iplayer_page_is_opened();
	}

	@When("^I click on first link$")
	public void i_click_on_first_link() {
		iplayer.i_click_on_first_link();
	}

	@When("^I select Programme website$")
	public void i_select_Programme_website() {
		iplayer.i_select_Programme_website();
	}

	@When("^I click on channels on iplayer page$")
	public void i_click_on_channels_on_iplayer_page() {
		iplayer.i_click_on_channels_on_iplayer_page();
	}

	@When("^I click on one$")
	public void i_click_on_one() {
		iplayer.i_click_on_one();
	}

	@When("^I click on Eastenders link under soaps$")
	public void i_click_on_Eastenders_link_under_soaps() {
		iplayer.i_click_on_Eastenders_link_under_soaps();
	}
}
