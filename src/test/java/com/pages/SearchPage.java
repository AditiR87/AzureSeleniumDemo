package com.pages;



import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseClassZTT;

public class SearchPage extends BaseClassZTT {

	public void search_page_for_is_displayed(String search) {
		Assert.assertEquals("BBC - Search results for " + search + "", driver.getTitle());
	}

	public void i_click_on_first_search_link() {
		driver.findElement(By.cssSelector("article[data-result-number='1']")).click();
	}
}