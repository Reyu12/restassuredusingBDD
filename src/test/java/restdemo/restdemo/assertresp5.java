package restdemo.restdemo;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class assertresp5 {
    
	 private static Response response;
	 
	@Given("i get the response for a specific date")
	public void i_get_the_response_for_a_specific_date() {
	    // Write code here that turns the phrase above into concrete actions
		response = RestAssured.get("https://api.ratesapi.io/api/2010-01-12?symbols=USD,GBP");
	    
	}
	@When("assert the response i got")
	public void assert_the_response_i_got() {
	    // Write code here that turns the phrase above into concrete actions
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
		Assert.assertEquals(response.toString(), 200, response.getStatusCode());

	}
	@Then("display the correct statuscode")
	public void display_the_correct_statuscode() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("statuscode is:"+ response.getStatusCode());

	}
}
