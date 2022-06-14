package Palindrome;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Palindrome.feature",glue= {"Palindrome"},
monochrome = true,
plugin={"pretty","junit:target/JunitReports/palindromereport.xml",
		"json:target/cucumber/palindromereport.json",
		"html:target/cucumber/palindromereport.html"},
tags="@smoketest,@ParameterizedTest"
)

public class PalindromeRunner1 {

}
