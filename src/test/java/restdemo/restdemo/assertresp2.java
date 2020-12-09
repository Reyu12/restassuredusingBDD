package restdemo.restdemo;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class assertresp2 {
 
	 private static Response response;
	 
	

	@Given("Rates API for Latest Foreign Exchange rates")
	public void rates_api_for_latest_foreign_exchange_rates() {
	    // Write code here that turns the phrase above into concrete actions
		response = RestAssured.get("https://api.ratesapi.io/api/latest?symbols=USD,GBP");
		
  
	}

	@When("The API is available")
	public void the_api_is_available() {
	    // Write code here that turns the phrase above into concrete actions
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	    
	}
	@Then("validate the response with assert")
	public void validate_the_response_with_assert() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(response.toString(), 200, response.getStatusCode());
	}
}
