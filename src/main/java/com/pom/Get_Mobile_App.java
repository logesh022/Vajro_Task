package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Get_Mobile_App {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//button[text()=\"GET YOUR MOBILE APP NOW\"]")
	private WebElement mobile_app;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMobile_app() {
		return mobile_app;
	}
	
	public Get_Mobile_App(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
