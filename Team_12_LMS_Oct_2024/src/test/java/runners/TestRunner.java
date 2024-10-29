package runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = {".//Features/Class.feature"},
    glue = "stepDefinition",
    plugin = {"pretty", "html:target/cucumber-reports"},
    monochrome = true,
    dryRun = false,
	  publish = true
	  
)
public class TestRunner extends AbstractTestNGCucumberTests{
}
