package DictionaryFunctionality;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DictionaryTest {
	
	String driverPath= "D:\\chromedriver\\chromedriver.exe";
	static WebDriver driver;
	
	DictionaryXML homepage;
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://dictionary.cambridge.org");
	}
	
	public void ValidateLogo() {
		homepage= new 
	}

}
