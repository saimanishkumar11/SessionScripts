package StepsDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/login.feature",glue= {"StepsDefinitions"},
monochrome = true,
plugin={"pretty","junit:target/JunitReports/report.xml",
		"json:target/cucumber/report.json",
		"html:target/cucumber/report.html"},
tags="@smokeTest"
)
public class TestRunner {
	

}


/*plugin={"pretty","junit:target/JunitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html.target/cucumber-reports"},*/