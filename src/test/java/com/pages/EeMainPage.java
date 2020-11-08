package com.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.runner.BaseClassZTT;

public class EeMainPage extends BaseClassZTT {
	public void check_the_time_for_the_next_episode() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-linktrack='map_tx_eptitle']")));
		Assert.assertEquals("BBC One - EastEnders", driver.getTitle());
		String date = driver.findElement(By.cssSelector("span[data-linktrack='map_tx_eptitle']")).getText();
		String time = driver.findElement(By.cssSelector("span[class='timezone timezone--time']")).getText();
		System.out.println("Next episode of EastEnd will be telecasted on " + date + " at " + time + ".");
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("/Users/Varun/eclipse-workspace/ZTT/src/test/resources/Screenshots/Screenshots.png"));

	}

}
