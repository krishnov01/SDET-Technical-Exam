package com.stepefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.common.BasePage;
import com.pages.HomePage;

public class ASPNETAWESOMEPageSteps extends BasePage {
	
	private static WebDriver driver;
	
	@Given("User open demo.aspnetaswesome page")
	public void user_open_demo_aspnetaswesome_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://demo.aspnetawesome.com/");
	}


	@Then("User extract the corresponding values of given ID {int}")
	public void user_extract_the_value_of_given_ID(int ID) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)", "");
		HomePage homePage = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Input Id Number: "+homePage.inputID(ID));
		System.out.println("Person: "+homePage.person(ID));
		System.out.println("Food: "+homePage.food(ID));
		System.out.println("Country: "+homePage.country(ID));
		System.out.println("Date: "+homePage.date(ID));
		System.out.println("Chef: "+homePage.chef(ID));
	}

	@Then("User close chrome")
	public void user_close_chrome() {
	    driver.close();
	}
}
