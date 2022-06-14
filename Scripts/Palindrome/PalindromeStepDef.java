package Palindrome;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PalindromeStepDef {
	
	private String testPalindrome;
	private boolean isPalindrome;
	
	@Given("^I entered string \"([^\"]*)\"$")
    public void I_entered_string(String toTest) {
        testPalindrome = toTest;
    }

 

    @When("^I test it for Palindrome$")
    public void I_test_it_for_Palindrome() {
        isPalindrome = testPalindrome.equalsIgnoreCase(new StringBuilder(testPalindrome).reverse().toString());
    }

 

    @Then("^the result should be \"([^\"]*)\"$")
    public void the_result_should_be(String result) {
        boolean expectedResult = Boolean.parseBoolean(result);
        if (expectedResult) {
            Assert.assertTrue(isPalindrome);
        } else {
            Assert.assertFalse(isPalindrome);
        }
    }

   @Given("^I entered word \"([^\"]*)\"$")
    public void I_entered_word(String word) {
        testPalindrome = word;
    }

 

    @Then("^the output should be \"([^\"]*)\"$")
    public void the_output_should_be(String output) {
        the_result_should_be(output);    
}


}
