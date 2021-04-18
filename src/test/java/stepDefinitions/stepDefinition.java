package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

	@Given("^Broswer is present in system$")
	public void broswer_is_present_in_system() throws Throwable {
		System.out.println("Background given");
	}

	@When("^Broser is triggered$")
	public void broser_is_triggered() throws Throwable {
		System.out.println("Background when");
	}

	@Then("^Broser is opened successfully$")
	public void broser_is_opened_successfully() throws Throwable {
		System.out.println("*****Background Then******");
	}

	@Given("^User is on netbanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		System.out.println("Given");
	}

	@When("^User logs in intgo application with username and password$")
	public void user_logs_in_intgo_application_with_username_and_password() throws Throwable {
		System.out.println("When");
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Then");
	}

	@And("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable {
		System.out.println("And then");
	}

	@When("^User logs in intgo application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_logs_in_intgo_application_with_username_and_password(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("When Arg1 " + arg1);
		System.out.println("When Arg2 " + arg2);

	}

	@Then("^Cards dispalyed is \"([^\"]*)\"$")
	public void cards_dispalyed_is(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("ANd then arg " + arg1);
		;
	}

	@When("^User signsup with below details$")
	public void user_signsup_with_below_details(DataTable data) throws Throwable {
		System.out.println("Sign up details:");
		List<List<String>> obj = data.asLists(String.class);
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));
	}

	@Then("^He or She signs up successfully$")
	public void heshe_signs_up_successfully() throws Throwable {
		System.out.println("signup Then");
	}

	@And("^Users name is displayed$")
	public void users_name_is_displayed() throws Throwable {
		System.out.println("Signup and then");
	}

	@When("^User logs in in the application with username (.+) and password (.+)$")
	public void user_logs_in_in_the_application_with_username_and_password(String username, String password)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("When parametrized " + username + " " + password);
	}

}
