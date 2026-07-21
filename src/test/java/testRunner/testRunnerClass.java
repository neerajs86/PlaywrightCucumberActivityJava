package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features =  {"D:\\Neeraj\\Playwright\\Playwright_Cucumber_Activity\\src\\resources"},
                glue = "stepdefinitions",
                dryRun = false,
                plugin = {"pretty", "html:Cucumber_Reports/reports.html", "json:Cucumber_Reports/report.json"}
        )


public class testRunnerClass extends AbstractTestNGCucumberTests {
}
