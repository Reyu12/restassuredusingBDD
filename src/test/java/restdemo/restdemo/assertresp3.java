package restdemo.restdemo;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class assertresp3 {
	
	 private static Response response;
	 private static int statusCode;
	 
	@Given("Rates API should be available")
	public void Rates_API_should_be_available() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("API is available");
		response = RestAssured.get(" https://api.ratesapi.io/api/latest?base=USD HTTP/2");
		}

	@When("get incorrect response")
	public void get_incorrect_response() {
	    // Write code here that turns the phrase above into concrete actions
		statusCode = response.getStatusCode();   
	}

   @Then("validate the response for a error code")
	public void validate_the_response_for_a_error_code() {
	    // Write code here that turns the phrase above into concrete actions
	  
	   Assert.assertEquals(400, statusCode);
	   System.out.println("status code :"+ statusCode);
	}
	}
	

