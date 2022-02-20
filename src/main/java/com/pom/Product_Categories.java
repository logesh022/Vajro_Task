package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Categories {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//iframe[@title=\"typeform-embed\"]")
	private WebElement frame;

	@FindBy(xpath = "//div[text()=\"Sports\"]")
	private WebElement sports;
	
	@FindBy(xpath = "//div[text()=\"$50,000+\"]")
	private WebElement avg_revenue;
	
	@FindBy(xpath = "(//div[@class=\"TextWrapper-sc-__sc-1f8vz90-0 kFnuru\"])[5]")
	private WebElement peers;
	
	@FindBy(xpath = "//div[text()=\"10,000-20,000\"]")
	private WebElement traffic;
	
	@FindBy(xpath = "//div[text()=\"60-100%\"]")
	private WebElement mob_devices_usage;
	
	@FindBy(xpath = "//div[text()=\"Yes\"]")
	private WebElement reg_cust;
	
	@FindBy(xpath = "//div[text()=\">30%`\"]")
	private WebElement rep_purchase;
	
	@FindBy(xpath = "//div[text()=\"Yes\"]")
	private WebElement impulse_purchase;
	
	@FindBy(xpath = "//div[text()=\">20,000\"]")
	private WebElement soc_media;
	
	@FindBy(name = "organization")
	private WebElement org_name;
	
	@FindBy(name = "email")
	private WebElement email;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getFrame() {
		return frame;
	}	
	
	public WebElement getSports() {
		return sports;
	}
	public WebElement getAvg_revenue() {
		return avg_revenue;
	}
	public WebElement getPeers() {
		return peers;
	}
	public WebElement getTraffic() {
		return traffic;
	}
	public WebElement getMob_devices_usage() {
		return mob_devices_usage;
	}
	public WebElement getReg_cust() {
		return reg_cust;
	}
	public WebElement getRep_purchase() {
		return rep_purchase;
	}
	public WebElement getImpulse_purchase() {
		return impulse_purchase;
	}
	public WebElement getSoc_media() {
		return soc_media;
	}
	public WebElement getOrg_name() {
		return org_name;
	}
	public WebElement getEmail() {
		return email;
	}
	
	public Product_Categories(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
