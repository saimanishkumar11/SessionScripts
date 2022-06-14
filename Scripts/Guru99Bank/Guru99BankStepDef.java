package Guru99Bank;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Guru99BankStepDef { 
    
    WebDriver driver = null;
    @Before public void setUp(){    
         System.setProperty("webdriver.gecko.driver", "D:\\firefoxdriver\\geckodriver.exe"); 
         driver = new FirefoxDriver();    
       }    
    
    @Given("^User navigates to \"([^\"]*)\"$")
    public void User_navigates_to_Guru99Bank(String arg1) {
         driver.navigate().to("http://demo.guru99.com/V4"); 
    }

    @When("^User enters valid credentials$")
    public void User_enters_valid_credentials(DataTable usercredentials){ 
                    
          List<List<String>> data = usercredentials.cells();
          //Enter data
          driver.findElement(By.name("uid")).sendKeys(data.get(0).get(0)); 
          driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
          driver.findElement(By.name("btnLogin")).click();
                              
    }
    
    @Then("^User Login Successful$")
    public void User_Login_Successful() {
         if(driver.getCurrentUrl().equalsIgnoreCase("http://demo.guru99.com/V4/manager/Managerhomepage.php")){
             System.out.println("Login Passed"); 
          } else { 
             System.out.println("Login Failed"); 
          } 
                
    }
    
    @After public void closeBrowser(){    
          driver.close();    
    }
    
}
