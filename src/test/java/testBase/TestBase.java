package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Enums.Browsers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;

	public WebDriver selectBrowser(String browser) {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
				ChromeOptions option = new ChromeOptions();
				// option.addArguments(")
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(option);
			}
			else if(browser.equalsIgnoreCase(Browsers.EDGE.name())) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}else if(browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
			}else if(browser.equalsIgnoreCase(Browsers.HEADLESS.name())) {
				WebDriverManager.chromedriver().setup();
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--remote-allow-origins");
				option.addArguments("--headless");
				option.addArguments("--disable-gpu"); // Disable GPU hardware acceleration (important for headless mode)
		        option.addArguments("--window-size=1920x1080");
		        driver= new ChromeDriver(option);
			}
		return driver;
	}
	
	public void MaximizeWindow() {
		driver.manage().window().maximize();
	}
}
