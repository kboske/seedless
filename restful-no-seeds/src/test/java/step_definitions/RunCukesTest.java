package step_definitions;

import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		plugin = {"pretty", "html:target/cucumber-html-report", "junit:target/cucumber-junit-report"},
		tags = {},
		snippets=SnippetType.CAMELCASE,
		glue= "classpath:step_definitions"
		)
public class RunCukesTest{
	
}