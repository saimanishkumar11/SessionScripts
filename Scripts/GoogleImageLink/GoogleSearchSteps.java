package GoogleImageLink;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Inside step browser is open");
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.get("https://google.com/");
		System.out.println("Inside step user is on google seach page");		
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("Cucumber");
		System.out.println("Inside step user enters a text in search box");
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Inside step user hits enter");		
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside step user is navigated to the home page");		
		driver.close();

}
}
