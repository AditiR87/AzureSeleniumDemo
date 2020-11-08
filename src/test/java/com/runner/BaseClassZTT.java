package com.runner;

import org.openqa.selenium.WebDriver;

import com.pages.EeMainPage;
import com.pages.HomePage;
import com.pages.Iplayer;
import com.pages.SearchPage;

public class BaseClassZTT {
	public static WebDriver driver;
	public static HomePage homepage = new HomePage();
	public static SearchPage searchtext= new SearchPage();
	public static EeMainPage eemainpage =new EeMainPage();
	public static Iplayer iplayer= new Iplayer();
	

}
