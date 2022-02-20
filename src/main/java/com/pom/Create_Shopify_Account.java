package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Shopify_Account {

	private WebDriver driver;
	
	@FindBy(xpath = "(//a[text()=\"Log in\"])[1]")
	private WebElement login;
	
//	@FindBy(xpath = "(//a[text()=\"Log in\"])[2]")
//	private WebElement login1;
	
	@FindBy(xpath = "//input[@value=\"Developer login\"]")
	private WebElement Dev_Login;
	
	@FindBy(xpath = "//a[text()=\"Get started\"]")
	private WebElement get_started1;
	
	@FindBy(xpath = "//input[@id=\"account_first_name\"]/preceding::input[@id=\"account_email\"]")
	private WebElement email1;
	
	@FindBy(id = "account_first_name")
	private WebElement firstname;
	
	@FindBy(id = "account_last_name")
	private WebElement lastname;
	
	@FindBy(id = "account_password")
	private WebElement acc_password;
	
	@FindBy(id = "password-confirmation")
	private WebElement con_password;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getDev_Login() {
		return Dev_Login;
	}

	public WebElement getGet_started1() {
		return get_started1;
	}

	public WebElement getEmail1() {
		return email1;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAcc_password() {
		return acc_password;
	}

	public WebElement getCon_password() {
		return con_password;
	}

	public Create_Shopify_Account(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
