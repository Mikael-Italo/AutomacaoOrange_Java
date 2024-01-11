package runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features"
		,glue= {"steps"}
		,tags = {"@PesquisarUsuario"}
		,plugin = {"pretty", "html:target/cucumber-reports"}
		,monochrome = true
		,dryRun = false
		)
public class TesteRunner {

}
