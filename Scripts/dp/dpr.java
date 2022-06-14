package dp;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)                
@CucumberOptions(features="src/test/resources/Features/dpf.feature",
glue= {"Dictionary"},
tags= "@dictionaryfunctionality",
monochrome = true,
plugin={"pretty","junit:target/JunitReports/dpreport.xml",
		"json:target/cucumber/dpreport.json",
		"html:target/cucumber/dpreport.html"}

)



public class dpr {

}
