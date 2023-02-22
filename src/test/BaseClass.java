package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

public class BaseClass {

	public RemoteWebDriver driver = null;
	String username = System.getenv("LT_USERNAME") == null ? "<lambdtatest_username>" : System.getenv("LT_USERNAME");
	String accessKey = System.getenv("LT_ACCESS_KEY") == null ? "<lambdtatest_accesskey>"
			: System.getenv("LT_ACCESS_KEY");

	public void setup(String browserName, boolean acceptInsecureSSL) {

		HashMap<String, Object> ltOptions = new HashMap<String, Object>();

		try {

			switch (browserName) {
			case "chrome":
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setPlatformName("Windows 10");
				chromeOptions.setBrowserVersion("110.0");
				ltOptions.put("build", "SSL certificates Using Selenium WebDriver");
				ltOptions.put("name", "Handling on Chrome");
				chromeOptions.setAcceptInsecureCerts(acceptInsecureSSL);
				chromeOptions.setCapability("LT:Options", ltOptions);
				driver = new RemoteWebDriver(
						new URL("https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub"), chromeOptions);
				break;
			case "firefox":
				FirefoxOptions firefoxOptions = new FirefoxOptions();
				firefoxOptions.setPlatformName("Windows 10");
				firefoxOptions.setBrowserVersion("109.0");
				ltOptions.put("build", "SSL certificates Using Selenium WebDriver");
				ltOptions.put("name", "Handling on Firefox");
				firefoxOptions.setAcceptInsecureCerts(acceptInsecureSSL);
				firefoxOptions.setCapability("LT:Options", ltOptions);
				driver = new RemoteWebDriver(
						new URL("https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub"),
						firefoxOptions);
				break;
			case "edge":
				EdgeOptions edgeOptions = new EdgeOptions();
				edgeOptions.setPlatformName("Windows 10");
				edgeOptions.setBrowserVersion("108.0");
				ltOptions.put("build", "SSL certificates Using Selenium WebDriver");
				ltOptions.put("name", "Handling on Edge");
				edgeOptions.setAcceptInsecureCerts(acceptInsecureSSL);
				edgeOptions.setCapability("LT:Options", ltOptions);
				driver = new RemoteWebDriver(
						new URL("https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub"), edgeOptions);
				break;
			case "safari":
				SafariOptions safariOptions = new SafariOptions();
				safariOptions.setPlatformName("MacOS Ventura");
				safariOptions.setBrowserVersion("16.0");
				ltOptions.put("build", "SSL certificates Using Selenium WebDriver");
				ltOptions.put("name", "Handling on Safari");
				safariOptions.setAcceptInsecureCerts(acceptInsecureSSL);
				safariOptions.setCapability("LT:Options", ltOptions);
				driver = new RemoteWebDriver(
						new URL("https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub"), safariOptions);
				break;
			}

		} catch (MalformedURLException e) {
			System.out.println("Invalid grid URL");
		}
	}
	
	public void navigateToUrls() {
		System.out.println("Navigating to Lambdatest URL");
		driver.get("https://www.lambdatest.com/");
		System.out.println("The page title is : " +driver.getTitle());
		
		System.out.println("Navigating to BadSSL URL");
		driver.get("https://expired.badssl.com/");
		System.out.println("The page title is : " +driver.getTitle());
		
		driver.quit();
	}
}
