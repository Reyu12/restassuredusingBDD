package restdemo.restdemo;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class assertresp4 {
	 private static Response response;
	 private static int statusCode; 
	
	 @Given("i get the responce for a date in step")
	 public void i_get_the_responce_for_a_date_in_step() {
	     // Write code here that turns the phrase above into concrete actions
		 System.out.println("API is available");
			response = RestAssured.get("https://api.ratesapi.io/api/2010-01-12");
	    
	 }
	 @When("i get the status of response in step")
	 public void i_get_the_status_of_response_in_step() {
	     // Write code here that turns the phrase above into concrete actions
			statusCode = response.getStatusCode();  
	 }
	 @Then("validate the statuscode of response")
	 public void validate_the_statuscode_of_response() {
	     // Write code here that turns the phrase above into concrete actions
		   Assert.assertEquals(200, statusCode);
		   System.out.println("status code :"+ statusCode);
	 }

}
