package JPetStore;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JpetStoreDef {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.gecko.driver","D:\\firefoxdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("Inside step browser is open");
	}
	
	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
		System.out.println("Inside step user is on login page");		
	}
	
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		//String un=username;
		//String pw=password;
		
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("password")).sendKeys(password);
		System.out.println("Inside step user enters username and password");
		
	Thread.sleep(2000);
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		driver.findElement(By.name("signon")).click();
		System.out.println("Inside step user clicks on login");		
		
		Thread.sleep(2000);
	}
	
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		System.out.println("Inside step user is navigated to home page");
		
		//driver.close();
}
	@Given ("user is on home page")
	public void user_is_on_home_page() {
		System.out.println("Inside step user is on home page");
	}
	
	
	
    @And ("^user search for (.*)$")
    public void user_search_for_pets(String pets) {
    	driver.findElement(By.name("keyword")).sendKeys(pets);
    	System.out.println("Inside step user search for pets");
    	
    }
    

    @When ("user click on search")
    public void user_click_on_search() {
    	driver.findElement(By.name("searchProducts")).click();
    	System.out.println("Inside step user click on search");
    }
    
    @Then ("user is navigated to pet page")
    public void user_is_navigated_to_pet_page() {
    	System.out.println("Inside step user navigated to pet page");
    }	
		
}
