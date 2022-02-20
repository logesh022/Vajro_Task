package com.base_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	// Webdriver Methods

	public static WebDriver driver;
	public static Actions ac;
	public static Select s;
	public static Robot r;
	public static Alert at;

	public static WebDriver Browser_Launch(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Logesh\\eclipse-workspace\\Project\\Vajro_Task\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Logesh\\eclipse-workspace\\Project\\Maven_Project\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		} else if (browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\Logesh\\eclipse-workspace\\Project\\Maven_Project\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static void Launch_URL(String url) {
		driver.get(url);
	}

	public static void Get_The_Title() {
		String title = driver.getTitle();
		System.out.println("Title of the Webpage is: " + title);
	}

	public static void Current_URL() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The current URL is: " + currentUrl);
	}

	public static void Close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void Navigate_to(String url) {
		driver.navigate().to(url);
	}

	public static void Navigate_forward() {
		driver.navigate().forward();
	}

	public static void Navigate_Refresh() {
		driver.navigate().refresh();
	}

	public static void Navigate_Back() {
		driver.navigate().back();
	}

	public static void Maximize_The_Window() {
		driver.manage().window().maximize();
	}

	// Weblement Methods

	public static void Screenshot() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Logesh\\eclipse-workspace\\Project\\Maven_Project\\Screenshot\\ss.png");
		FileUtils.copyFile(source, destination);

	}

	public static void Dropdown(WebElement element, String text) {

		s = new Select(element);
//		s.selectByIndex(index);
//		s.selectByValue(value);
		s.selectByVisibleText(text);
	}

	public static void isMultiple(WebElement element) {
		s = new Select(element);

		if (s.isMultiple()) {

			System.out.println("It is multiple dropdown.");

		}

		else {

			System.out.println("it is not multiple dropdown.");
		}
	}

	public static void Get_First_Selected_Option(WebElement element) {
		s = new Select(element);
		WebElement firstoption = s.getFirstSelectedOption();
		String text = firstoption.getText();
		System.out.println("First Selected Option is :" + text);
	}

	public static void Get_All_Selected_Option(WebElement element) {
		s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

		for (WebElement options : allSelectedOptions) {
			String text = options.getText();
			System.out.println("All Selected Options are :" + text);
		}
	}

	public static void All_Options(WebElement element) {
		s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement options1 : options) {
			String text = options1.getText();
			System.out.println("Listed Options are: " + text);
		}

	}

	public static void Click(WebElement element) {
		element.click();
	}

	public static void Sendkeys(WebElement element, CharSequence keysToSend) {
		element.sendKeys(keysToSend);
	}

	public static void Get_Text(WebElement element) {
		String text = element.getText();
		System.out.println("Text is: " + text);
	}

	public static void Get_Attribute(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		System.out.println("Received Attribut is: " + attribute);

	}

	public static void Is_Enable(WebElement element) {

		if (element.isEnabled()) {
			System.out.println("Element is enabled");
		}

		else {
			System.out.println("Element is not enabled");
		}

	}

	public static void Is_Displayed(WebElement element) {

		if (element.isDisplayed()) {
			System.out.println("Element is displayed");
		}

		else {
			System.out.println("Element is not displayed");
		}

	}

	public static void Is_Selected(WebElement element) {

		if (element.isSelected()) {
			System.out.println("Element is Selected");
		}

		else {
			System.out.println("Element is not Selected");
		}

	}

	public static void Move_To_Element(WebElement element) {
		ac = new Actions(driver);
		ac.moveToElement(element);
	}

	public static void Context_Click(WebElement element) { // performs right click
		ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}

	public static void Double_Click(WebElement element) { // performs double click
		ac = new Actions(driver);
		ac.doubleClick(element).build().perform();
	}

	public static void Click_And_Hold(WebElement element) { // click and hold the element without releasing it
		ac = new Actions(driver);
		ac.click(element).build().perform();
	}

	public static void Drag_And_Drop(WebElement source, WebElement target) { // drag the element from one point and drop
																				// in another point
		ac = new Actions(driver);
		ac.dragAndDrop(source, target).build().perform();

	}

	public static void Release(WebElement element) { // releases the element
		ac = new Actions(driver);
		ac.release(element).build().perform();
	}

	// ROBOT

	public static void Robot() throws AWTException {
		r = new Robot();
	}
	
	public static void Key_Press_Contol() {
		r.keyPress(KeyEvent.VK_CONTROL);
	}
	
	public static void Key_Release_Contol() {
		r.keyRelease(KeyEvent.VK_CONTROL);
	}	

	public static void Key_Press_DOWN() {
		r.keyPress(KeyEvent.VK_DOWN);
	}

	public static void Key_Press_UP() {
		r.keyPress(KeyEvent.VK_UP);
	}

	public static void Key_Release_DOWN() {
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void Key_Release_UP() {
		r.keyRelease(KeyEvent.VK_UP);
	}

	public static void Key_Press_Enter() {
		r.keyPress(KeyEvent.VK_ENTER);
	}

	public static void Key_Release_Enter() {
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// WINDOW HANDLE

	public static void Window_Handle() {
		String windowHandle = driver.getWindowHandle();
		String title = driver.switchTo().window(windowHandle).getTitle();
		System.out.println("Title of the window is: " + title);
	}

	public static void Window_Handles1() {
		Set<String> windowHandles1 = driver.getWindowHandles();
		for (String name1 : windowHandles1) {
			String title = driver.switchTo().window(name1).getTitle(); // to get titles of the windows
			System.out.println(title);
		}

	}

	public static void Window_Handles_2(String title) {
		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String name2 : windowHandles2) {
			if (driver.switchTo().window(name2).getTitle().equals(title)) {
				break;
			}
		}
	}

//			Frames

	public static void frames(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void DefaultContent() {
		driver.switchTo().defaultContent();
	}

	// ALERT

	public static void Alert() {
		driver.switchTo().alert();
	}

	public static void Accept() {
		at.accept();
	}

	public static void Dismiss() {
		at.dismiss();
	}

//		 	WAIT

	public static void Wait() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static void Implicit_Wait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void Explicit_Wait(WebElement element, int time) {
		WebDriverWait explicitwait = new WebDriverWait(driver, time);
		explicitwait.until(ExpectedConditions.visibilityOf(element));
	}

//			Scroll  Up and Down

	public static void Scroll_Up() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}

	public static void Scroll_Down() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)", "");
	}

}
