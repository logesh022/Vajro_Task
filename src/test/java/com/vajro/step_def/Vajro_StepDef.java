package com.vajro.step_def;

import org.openqa.selenium.WebDriver;

import com.base_class.BaseClass;
import com.page_object_manager.Vajro_Page_Object_Manager;
import com.pom.Create_Shopify_Account;
import com.pom.Get_Mobile_App;
import com.pom.Product_Categories;
import com.vajro.runner.Vajro_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Vajro_StepDef extends BaseClass {

	public static WebDriver driver = Vajro_Runner.driver;

	Vajro_Page_Object_Manager pom = new Vajro_Page_Object_Manager(driver);
	Create_Shopify_Account csa = new Create_Shopify_Account(driver);
	Get_Mobile_App app = new Get_Mobile_App(driver);
	Product_Categories pc = new Product_Categories(driver);

	@Given("^User Select The Categories Required$")
	public void user_Select_The_Categories_Required() throws Throwable {

	}

	@When("^Product Category$")
	public void product_Category() throws Throwable {
		frames(pc.getFrame());
		pom.getPc().getSports().click();
	}

	@When("^Average Revenue$")
	public void average_Revenue() throws Throwable {
		Explicit_Wait(pc.getAvg_revenue(), 30);
		pc.getAvg_revenue().click();		
	}

	@When("^Push Notification And Mobile Engagement$")
	public void push_Notification_And_Mobile_Engagement() throws Throwable {
		Explicit_Wait(pc.getPeers(), 30);
		pc.getPeers().click();
	}

	@When("^Traffic Limit$")
	public void traffic_Limit() throws Throwable {
		Explicit_Wait(pc.getTraffic(), 30);
		pc.getTraffic().click();
		
	}

	@When("^Usage From Mobile Devices$")
	public void usage_From_Mobile_Devices() throws Throwable {
		Explicit_Wait(pc.getMob_devices_usage(), 30);
		Click(pc.getMob_devices_usage());

	}

	@When("^Repeated Buy$")
	public void repeated_Buy() throws Throwable {
		Explicit_Wait(pc.getReg_cust(), 15);
		Click(pc.getReg_cust());
	
	}

	@When("^Repeated Purchase From The Store$")
	public void repeated_Purchase_From_The_Store() throws Throwable {
		Explicit_Wait(pc.getRep_purchase(), 15);
		Click(pc.getRep_purchase());

	}

	@When("^Impluse Purchase$")
	public void impluse_Purchase() throws Throwable {
		Explicit_Wait(pc.getImpulse_purchase(), 15);
		Click(pc.getImpulse_purchase());

	}

	@When("^Followers On Social Media$")
	public void followers_On_Social_Media() throws Throwable {
		Explicit_Wait(pc.getSoc_media(), 14);
		Click(pc.getSoc_media());

	}

	@When("^Store Name$")
	public void store_Name() throws Throwable {
		Explicit_Wait(pc.getOrg_name(), 14);
		Sendkeys(pc.getOrg_name(), "frost");
		Robot();
		Key_Press_Enter();
		Key_Release_Enter();

	}

	@Then("^User Submits The Mail_Id To Receive Emails$")
	public void user_Submits_The_Mail_Id_To_Receive_Emails() throws Throwable {
		Explicit_Wait(pc.getEmail(), 10);
		Sendkeys(pc.getEmail(), "xxx@gmail.com");
		Robot();
		Key_Press_Contol();
		Key_Press_Enter();
		Key_Release_Contol();
		Key_Release_Enter();

	}

	@When("^User Clicks The Button-Get Your Mobile App Now$")
	public void user_Clicks_The_Button_Get_Your_Mobile_App_Now() throws Throwable {
		DefaultContent();
		Scroll_Down();
		Scroll_Down();
		Explicit_Wait(app.getMobile_app(), 15);
		Click(app.getMobile_app());
	}

	@When("^User Clicks On Shopify\\.com$")
	public void user_Clicks_On_Shopify_com() throws Throwable {
		Explicit_Wait(csa.getLogin(), 10);
		csa.getLogin().click();
	}

	@When("^User Clicks On Login Button$")
	public void user_Clicks_On_Login_Button() throws Throwable {
		Explicit_Wait(csa.getDev_Login(), 20);
		Click(csa.getDev_Login());
	}

	@Then("^User Clicks Get Started$")
	public void user_Clicks_Get_Started() throws Throwable {
		Explicit_Wait(csa.getGet_started1(), 5);
		Click(csa.getGet_started1());
	}

	@When("^User Enters The Email$")
	public void user_Enters_The_Email() throws Throwable {
		Explicit_Wait(csa.getEmail1(), 15);
		Sendkeys(csa.getEmail1(), "ABC@gmail.com");
	}

	@When("^User Enters FirstName$")
	public void user_Enters_FirstName() throws Throwable {
		Explicit_Wait(csa.getFirstname(), 3);
		Sendkeys(csa.getFirstname(), "ABC");
	}

	@When("^User Enters LastName$")
	public void user_Enters_LastName() throws Throwable {
		Explicit_Wait(csa.getLastname(), 3);
		Sendkeys(csa.getLastname(), "DEF");
	}

	@When("^User Enters Password$")
	public void user_Enters_Password() throws Throwable {
		Explicit_Wait(csa.getAcc_password(), 3);
		Sendkeys(csa.getAcc_password(), "Abcdef@123");
	}

	@When("^User Enters ConfirmNewPassword$")
	public void user_Enters_ConfirmNewPassword() throws Throwable {
		Sendkeys(csa.getCon_password(), "Abcdef@123");
	}

	@Then("^User Clicks On Create Shopify ID$")
	public void user_Clicks_On_Create_Shopify_ID() throws Throwable {
		System.out.println("Account Creation Is On Hold");
	}

}
