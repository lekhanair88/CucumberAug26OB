package working;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {
	@Given("^Build The project$")
	public void build_The_project() throws Throwable {
		System.out.println("Give the build in jenkins");
	}

	@Then("^cucumber reports must be created$")
	public void cucumber_reports_must_be_created() throws Throwable {
		System.out.println("cucumber reports must be ready!!");
	}

}
