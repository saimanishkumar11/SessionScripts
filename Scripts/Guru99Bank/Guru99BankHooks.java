package Guru99Bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Guru99BankHooks {
    WebDriver driver = null;
    @Before public void setUp(){    
         System.setProperty("webdriver.gecko.driver", "D:\\firefoxdriver\\geckodriver.exe"); 
         driver = new FirefoxDriver();    
       }    
    
    @After public void closeBrowser(){    
          driver.close();    
    }

}

