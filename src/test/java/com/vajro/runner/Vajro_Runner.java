package com.vajro.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.base_class.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Logesh\\eclipse-workspace\\Project\\Vajro_Task\\src\\test\\java\\com\\vajro\\feature\\Vajro.Feature", 
glue = "com.vajro.step_def", monochrome = true, dryRun = false, strict = true, plugin = {"pretty", "html:Reports/Cucumber_Report", "json:Reports/Cucumber_Report.json", "com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"} )

public class Vajro_Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void set_UP() throws InterruptedException {
		driver=BaseClass.Browser_Launch("chrome");
		BaseClass.Launch_URL("https://www.vajro.com/quiz");	
	}
	
	@AfterClass
	public static void tear_Down() throws IOException, InterruptedException {
		BaseClass.Screenshot();
		BaseClass.Wait();
//		BaseClass.Close();
	}

}
