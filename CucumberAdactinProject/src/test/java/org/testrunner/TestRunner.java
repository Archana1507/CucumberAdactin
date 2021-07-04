package org.testrunner;


import org.junit.AfterClass;

import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature File\\search.feature",glue="org.stepdefinition",
dryRun =false,monochrome=true,strict=false,snippets=SnippetType.CAMELCASE,tags= {"@search"},
plugin= {"pretty",
		"html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\output.json",
		"junit:src\\test\\resources\\Reports.adactin.xml"})
public class TestRunner {
	
	@AfterClass
	public static void JvmReportGeneration() {
		JvmReport.generateJvmreport(System.getProperty("user.dir")+"src\\test\\resources\\Reports\\output.json");
		
//		JvmReport.generateJvmreport(System.getProperty("user.dir")+"src\\test\\resources\\Reports\\output.json");
		
//		JvmReport.generateJvmreport(System.getProperty("user.dir")+"src\\test\\resources\\Reports\\output.json");
}}