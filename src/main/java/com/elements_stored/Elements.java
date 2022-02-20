package com.elements_stored;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base_class.BaseClass;

public class Elements extends BaseClass{
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		 driver = BaseClass.Browser_Launch("chrome");
		
		Launch_URL("https://www.vajro.com/quiz");
		
		WebElement f1 = driver.findElement(By.xpath("//iframe[1]"));
		frames(f1);
		
		Wait();
		
		WebElement sports = driver.findElement(By.xpath("(//div[@class=\"Hint-sc-__sc-p7s0zv-3 gmTZfR\"])[3]"));
		sports.click();
		
		Wait();
		
		WebElement avg_revenue = driver.findElement(By.xpath("(//div[@class=\"ChoiceContent-sc-__sc-m4g23g-0 ImOCO\"])[20]"));
		avg_revenue.click();
		
		Wait();
		
		WebElement peers = driver.findElement(By.xpath("//div[text()=\"Yes, quite a few\"]"));
		peers.click();
		
		Wait();
		
		WebElement traffic = driver.findElement(By.xpath("//div[text()=\"10,000-20,000\"]"));
		traffic.click();
		
		Wait();
		
		WebElement mob_devices_usage = driver.findElement(By.xpath("//div[text()=\"60-100%\"]"));
		mob_devices_usage.click();
		
		Wait();
		
		WebElement reg_cust = driver.findElement(By.xpath("(//div[@class=\"ChoiceContent-sc-__sc-m4g23g-0 ImOCO\"])[4]"));
		reg_cust.click();
		
		Wait();
		
		WebElement rep_purchase = driver.findElement(By.xpath("//div[text()=\"I don’t know\"]"));
		rep_purchase.click();
		
		Wait();
		
		WebElement impulse_purchase = driver.findElement(By.xpath("(//div[@class=\"ChoiceContent-sc-__sc-m4g23g-0 ImOCO\"])[5]"));
		impulse_purchase.click();
		
		Wait();
		
		WebElement soc_media = driver.findElement(By.xpath("//div[text()=\">20,000\"]"));
		Click(soc_media);
		
		Wait();
		
		WebElement org_name = driver.findElement(By.name("organization"));
		Sendkeys(org_name, "Frost");
		
		Robot();
		
		Key_Press_Enter();
		Key_Release_Enter();
		
		Wait();
		
		WebElement email = driver.findElement(By.name("email"));
		Sendkeys(email, "xxx@gmail.com");
		
		Key_Press_Contol();
		Key_Press_Enter();
		Key_Release_Contol();
		Key_Release_Enter();
		
		Wait();
		
		DefaultContent();
		
		Wait();
		
//		WebElement demo = driver.findElement(By.xpath("//button[text()=\"SCHEDULE MY DEMO\"]"));
//		Click(demo);
		
		WebElement mobile_app = driver.findElement(By.xpath("//button[text()=\"GET YOUR MOBILE APP NOW\"]"));
		
		Explicit_Wait(mobile_app, 10);
		
		
		mobile_app.click();
		
//		WebElement cookie = driver.findElement(By.xpath("//button[text()=\"I understand\"]"));
//		
//		if (cookie.isDisplayed()) {
//			cookie.click();
//		}
		
		
//		Login 
		
		WebElement login = driver.findElement(By.xpath("(//a[text()=\"Log in\"])[1]"));
		Click(login);
		
		Wait();
		
		WebElement dev_login = driver.findElement(By.xpath("//input[@value=\"Developer login\"]"));
		Click(dev_login);
		
		WebElement get_started = driver.findElement(By.xpath("//a[text()=\"Get started\"]"));
		get_started.click();
		
		Wait();
		
		WebElement email2 = driver.findElement(By.xpath("//input[@id=\"account_email\"]"));
		Sendkeys(email2, "xxx@gmail.com");
		
		WebElement fname = driver.findElement(By.name("account[first_name]"));
		Sendkeys(fname, "xxx");
		
		WebElement lname = driver.findElement(By.name("account[last_name]"));
		Sendkeys(lname, "yyy");
		
		WebElement acc_pass = driver.findElement(By.xpath("(//input[@id=\"account_password\"])"));
		acc_pass.sendKeys("abcd1234");

		WebElement con_pass = driver.findElement(By.xpath("(//input[@id=\"password-confirmation\"])"));
		con_pass.sendKeys("abcd1234");
		
//		WebElement create = driver.findElement(By.name("commit"));
//		create.click();
		
//		WebElement next_month = driver.findElement(By.xpath("//span[@class=\"_SnGz9MOyuhT1YSC8fIa T2G0Ygt6elinfFBmJqja dN8QZJkNSUcDrWG41iiL _FWLDVoAfq9gtgDKGyEu _kfT7iKHBHeEpplwWaDi N2Z4uMlc7FTb_3stxUDP K0y8e6UTsMdzBbWxEOXd Amr3fhAFjIQncUSzDNE0 sl5fAQctEj1Mnp6hZaum _n7AjSA4KmznUg4mE468 mimptqbwq4XcPHFnsMhs _VvMKil6pcEJGzsUhvp2 LffFscH7A79w1KFIwnSM\"]"));
//		Click(next_month);
//		
//		Wait();
//		
//		WebElement click_date = driver.findElement(By.xpath("(//span[text()=\"12\"])[2]"));
//		click_date.click();
//		
//		WebElement schedule_time = driver.findElement(By.xpath("//button[@data-start-time=\"12:45am\"]"));
//		Click(schedule_time);
//		
//		WebElement confirm = driver.findElement(By.xpath("(//button[text()=\"Confirm\"])[4]"));
//		confirm.click();
		
		
//		Clicl shopify.com andcreate a new id
		
		WebElement shopify_com = driver.findElement(By.xpath("(//a[@itemprop=\"name\"])[1]"));
		WebElement login1 = driver.findElement(By.xpath("(//a[text()=\"Log in\"])[2]"));
		WebElement get_started1 = driver.findElement(By.xpath("//a[text()=\"Get started\"]"));
		WebElement email1 = driver.findElement(By.id("account_email"));
		WebElement firstname = driver.findElement(By.id("account_first_name"));
		WebElement lastname = driver.findElement(By.id("account_last_name"));
		WebElement acc_password = driver.findElement(By.id("account_password"));
		WebElement con_password = driver.findElement(By.id("password-confirmation"));
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
