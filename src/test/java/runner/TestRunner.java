package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features =  {"D:\\Neeraj\\Playwright\\Playwright_Cucumber_Activity\\src\\resources"},
                glue = "stepdefinitions",
                dryRun = false,
                plugin = {"pretty", "html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/report.json"}
        )


public class TestRunner extends AbstractTestNGCucumberTests {
}
