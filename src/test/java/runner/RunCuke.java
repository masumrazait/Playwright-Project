package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",glue = {"step"},
plugin = {"html:target/cucumber-reports/cucumber-html-report.html"})
public class RunCuke  extends AbstractTestNGCucumberTests {
}
