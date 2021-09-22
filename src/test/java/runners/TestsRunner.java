package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"}, // shows the runtime test log.		
		features = "src/test/resources/features",
		glue = "stepdefinitions",
		snippets = SnippetType.CAMELCASE, //activate the "CamelCase" onto snippet.
		monochrome = true, // turns the console "black and white".
		dryRun = false,// creates the missed scenario test snippet.
		tags = "@stopwatchBDD" // the specific tag that will be executed.dashBoardPage
		)
public class TestsRunner {
    
    

}
