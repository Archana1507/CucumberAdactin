package org.stepdefinition;

import java.io.IOException;

import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {


	@Before
	public void beforeScenario(){
        System.out.println("Scenario starts....");
		launchBrowser();
		maximieWindow();
		waitToAllLocators();

	}

	@After
	public void afterScenario(Scenario s) throws IOException {
		String name=s.getName();
		takeSnap(name);
		closeBrowser();
		System.out.println(".....Scenario ends");
	}
	
	@Before("@smoke")
	public void beforeSmokeScenario() {
		System.out.println("smoke scenario starts....");
	}
	
	@After("@smoke")
	public void afterSmokeScenario() {
		
			System.out.println("........smoke scenario ends");
	}
	
	
}



