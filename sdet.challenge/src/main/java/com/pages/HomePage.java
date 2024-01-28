package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	static WebDriver driver;
	
	public HomePage(WebDriver driver){
		HomePage.driver = driver;
	}
	
	public String inputID (int ID) {
		String inputID = driver.findElement(By.xpath("//tr[@data-k="+ID+"]/td[1]")).getText();
		return inputID;
	}
	
	public String person (int ID) {
		String person = driver.findElement(By.xpath("//tr[@data-k="+ID+"]/td[2]")).getText();
		return person;
	}
	
	public String food (int ID) {
		String food = driver.findElement(By.xpath("//tr[@data-k="+ID+"]/td[3]")).getText();
		return food;
	}
	
	public String country (int ID) {
		String country = driver.findElement(By.xpath("//tr[@data-k="+ID+"]/td[4]")).getText();
		return country;
	}
	
	public String date (int ID) {
		 String date = driver.findElement(By.xpath("//tr[@data-k="+ID+"]/td[5]")).getText();
		return date;
	}
	
	public String chef (int ID) {
		String chef = driver.findElement(By.xpath("//tr[@data-k="+ID+"]/td[6]")).getText();
		return chef;
	}
	
	 
	 
	 
	
	 

}
