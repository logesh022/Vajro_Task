package com.page_object_manager;

import org.openqa.selenium.WebDriver;

import com.pom.Create_Shopify_Account;
import com.pom.Get_Mobile_App;
import com.pom.Product_Categories;

public class Vajro_Page_Object_Manager {
	
	public static WebDriver driver;
	private Get_Mobile_App app;
	private Product_Categories pc;
	private Create_Shopify_Account csa;
	
	public static WebDriver getDriver() {
		return driver;
	}
	public Get_Mobile_App getApp() {
		app = new Get_Mobile_App(driver);
		return app;
	}
	public Product_Categories getPc() {
		pc = new Product_Categories(driver);
		return pc;
	}
	public Create_Shopify_Account getCsa() {
		csa = new Create_Shopify_Account(driver);
		return csa;
	}
	
	public Vajro_Page_Object_Manager(WebDriver driver){
		this.driver=driver;
	}
	
	

}
