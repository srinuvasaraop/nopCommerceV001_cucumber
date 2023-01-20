package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = ".//Features",
                glue = "stepdefinitions",
                dryRun = false,
                monochrome = true,
               plugin = {"pretty","html:target-output/cucumber-report.html"},
                tags = "@sanityor"
        )
public class JunitRunner {

}
