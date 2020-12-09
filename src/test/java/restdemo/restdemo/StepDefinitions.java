package restdemo.restdemo;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class StepDefinitions {
	
	 private static Response response;
	 private static int statusCode;
	 
	@Given("user go to url")
	public void user_go_to_url() {
	    // Write code here that turns the phrase above into concrete actions
		response = RestAssured.get("https://api.exchangeratesapi.io/latest");
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);

	}


	@When("get response code")
	public void get_response_code() {
	    // Write code here that turns the phrase above into concrete actions
		  statusCode = response.getStatusCode();
			System.out.println("Status Code: "+statusCode );
	  
	    
	}
	@Then("validate the response which should be correct")
	public void validate_the_response_which_should_be_correct() {
	    // Write code here that turns the phrase above into concrete actions
		/*if(statusCode==200)
			System.out.println("success");*/
		
		Assert.assertEquals(200, statusCode);
		System.out.println("success");

	}


}
