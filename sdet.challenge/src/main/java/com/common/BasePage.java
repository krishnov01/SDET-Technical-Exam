package com.common;

import org.openqa.selenium.WebDriver;

import io.cucumber.core.cli.Main;

public class BasePage {

	public static WebDriver driver;
	public static void main(String args[]) throws Throwable {
	    try {
	        Main.main(new String[] { 
	    

	        "-g","com.common",
	        "-g","com.stepdefinitions",
	        "-g","com.testng.runner",
	                    
	        "classpath:features", 
	        
	        "-t","@tag1",
	        
	                
	        "-p", "pretty", 
	        "-p", "json:target/cucumber-reports/cucumber.json", 
	        "-p", "html:target/cucumber-reports/cucumberreport.html",
	        
	        "-m"
	    }
	    );
	} catch (Exception e) {
	        e.printStackTrace();
	        System.out.println("Main method exception : " + e);
	}
	}

}
