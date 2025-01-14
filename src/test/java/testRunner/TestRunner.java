package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", 
				glue = {"StepDefination"}, 
				tags = ("@GrowwLogin"), 
				monochrome = true, 
				dryRun = true, 
				plugin = { "pretty",
				"json:target/cucumber.json", })

public class TestRunner {
}
