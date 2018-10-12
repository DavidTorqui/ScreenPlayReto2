package ScreenPlay.Reto2.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/RegistrarEmpleado.feature",
		tags= "@tag1",
		glue="ScreenPlay.Reto2.StepDefinitions",
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {
}

