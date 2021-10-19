package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hrm_init {
	public WebDriver driver;
	String chromepath = "/Users/saranya/Downloads/chromedriver";
	String appPath = "https:\\opensource-demo.orangehrmlive.com";
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",chromepath );  
		driver = new ChromeDriver();
	}
	
	public void openApp() {
		driver.get(appPath);
	}
}
