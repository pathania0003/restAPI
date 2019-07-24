package com.amdocs.ReatAPI;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.DEFINED_PORT, classes = ReatApiApplication.class)
public class stepdef 
{
	
	String url;
	Double result;
	@Given("A rest url as {string}")
	public void a_rest_url_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    url = string;
	    
	}
	
	
	
	@When("invoking rest api for addition")
	public void invoking_rest_api_for_addition() {
	    // Write code here that turns the phrase above into concrete actions
	    RestTemplate restTemplate = new RestTemplate();
	    result = restTemplate.getForObject(url, Double.class);
	}

	@Then("expecting result as {int}")
	public void expecting_result_as(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(result,int1,0.01);
	}
}
