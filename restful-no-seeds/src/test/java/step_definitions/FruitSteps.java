package step_definitions;

import java.io.PrintWriter;
import java.util.List;

import modules.Fruit;
import cucumber.api.java.en.Given;
import gherkin.deps.com.google.gson.Gson;

public class FruitSteps {
	@Given("^the system knows about the following fruit:$")
	public void theSystemKnowsAboutTheFollowingFruit(List<Fruit> fruitList)
			throws Throwable {
		Gson gson = new Gson();
		PrintWriter writer = new PrintWriter("fruit.json", "UTF-8");
		writer.println(gson.toJson(fruitList));
		writer.close();
	}

}
