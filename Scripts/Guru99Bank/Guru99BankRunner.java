package Guru99Bank;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)                
@CucumberOptions(features="src/test/resources/Guru99Bank/Guru99Bank.feature",glue= {"Guru99Bank"},
monochrome = true,
plugin={"pretty","junit:target/JunitReports/guru99report.xml",
		"json:target/cucumber/guru99report.json",
		"html:target/cucumber/gurureport.html"}
//tags="@logo"
)

public class Guru99BankRunner                
{        

}

