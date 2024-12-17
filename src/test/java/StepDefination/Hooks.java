package StepDefination;

import Enums.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import testBase.TestBase;

public class Hooks extends TestBase {

	@Before
	public void initializeTest(Scenario scenario) {
		System.out.println("Hooks at Before Method are Executed ");
		selectBrowser(Browsers.CHROME.name());
		MaximizeWindow();
	}

	@After
	public void TearDown(Scenario scenario) {
		driver.quit();
	}
}
