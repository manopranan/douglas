package StepDefinitions;

import PageClass.PageClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
     PageClass pageClass = new PageClass();

    @Given("Launch The Url")
    public void launch_the_url() throws InterruptedException {
        pageClass.launchurl();
    }
    @When("Handle The Cookie Consnet")
    public void handle_the_cookie_consnet() throws InterruptedException {
        pageClass.Consnet();
    }

    @When("Click The Parfum")
    public void click_the_parfum() throws InterruptedException {
        pageClass.Parfum();
    }

    @When("Select The {string}")
    public void select_the(String string) {

    }

    @When("Choose The Brand {string}")
    public void choose_the_brand(String string) {

    }

    @When("Choose For Whom {string}")
    public void choose_for_whom(String string) {

    }

    @When("Choose The Actions {string}")
    public void choose_the_actions(String string) {

    }

    @Then("Verify The Filtered Results")
    public void verify_the_filtered_results() {

    }
}
