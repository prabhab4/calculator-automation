package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = {
                "src/test/resource/features/"
        },
        glue = "stepdefinitions/",
        format = {"pretty"}
)
public class RunCalculatorTest extends AbstractTestNGCucumberTests{}
