package com.stepdefinition;

import com.Base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;



 
public class HooksClass extends BaseClass {
	@Before
	public void beforeExecution() {
		getDriver();
		launchUrl("https://adactinhotelapp.com/HotelAppBuild2/");
		maxWindow(); 
		
		}
	@After
	public void afterExecution() {
		 quitBrowser();
	}
}