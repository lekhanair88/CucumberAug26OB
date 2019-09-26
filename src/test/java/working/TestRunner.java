package working;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\lekha.k.nair\\Desktop\\Workspace-BackUp\\eclipse-Cucumber\\FirstJob\\src\\resources\\java\\FirstJob.feature",
		plugin= {"pretty","html:target/cucumber"})

public class TestRunner {

}
