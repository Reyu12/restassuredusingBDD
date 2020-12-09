package restdemo.restdemo;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class assertresp6 
{
	private static Response response;
	@Given("send the request with future date")
	public void send_the_request_with_future_date() {
	    // Write code here that turns the phrase above into concrete actions
		response = RestAssured.get("https://api.ratesapi.io/api/2020-12-11?base=USD&symbols=GBP");
	}
	@When("get the response for given request")
	public void get_the_response_for_given_request() {
	    // Write code here that turns the phrase above into concrete actions
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}
	@Then("check that response matches with current date")
	public void check_that_response_matches_with_current_date() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(response.toString(), 200, response.getStatusCode()); 
	}

}
