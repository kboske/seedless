package step_definitions;

import gherkin.deps.com.google.gson.JsonParser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.ServerHooks;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import java.net.HttpURLConnection;

import javax.ws.rs.core.MediaType;

import modules.Fruit;

import org.junit.Assert;

public class RestSteps {
	private ClientResponse response;

	@When("^the client requests GET /fruits$")
	public void theClientRequestsGETFruits() throws Throwable {
		try {

			Client client = Client.create();

			WebResource webResource = client.resource("http://localhost:"
					+ ServerHooks.PORT + "/fruits");

			response = webResource.type(MediaType.APPLICATION_JSON).get(
					ClientResponse.class);

		} catch (RuntimeException r) {
			throw r;
		} catch (Exception e) {
			System.out.println("Exception caught");
			e.printStackTrace();
		}

		Assert.assertEquals("Did not receive OK response: ",
				HttpURLConnection.HTTP_OK, response.getStatus());
	}

	@Then("^the response should be JSON:$")
	public void theResponseShouldBeJSON(String jsonExpected) throws Throwable {
		JsonParser parser = new JsonParser();
		InputStream is = response.getEntityInputStream();
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int length;
		while ((length = is.read(buffer)) != -1) {
			result.write(buffer, 0, length);
		}
		ObjectMapper mapper = new ObjectMapper();
		String value = result.toString("UTF-8");
		// JSON from String to Object
		Fruit[] obj = mapper.readValue(value, Fruit[].class);
		// Object to JSON in String
		String jsonInString = mapper.writeValueAsString(obj);
		Assert.assertEquals("Unexpected JSON.", parser.parse(jsonExpected),
				parser.parse(jsonInString));
	}
}
