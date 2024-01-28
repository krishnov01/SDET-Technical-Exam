package com.testng.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		tags = "@tag1",

		features = "classpath:features", glue = { "com.common", "com.stepdefinitions",
		"com.testng.runner" }, 

		plugin = { "pretty", "json:target/cucumber-reports/cucumber.json",
				"html:target/cucumber-reports/cucumberreport.html" },

		monochrome = true)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

}
