package StepDefinitions;

import PageClass.PageClass;
import io.cucumber.java.en.And;
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
    public void select_the(String Producttype) throws InterruptedException {
        pageClass.producttypeselect(Producttype);

    }

    @And("Choose The Brand {string}")
    public void chooseTheBrandBrand(String brand) throws InterruptedException {
        pageClass.selectbrand(brand);
    }

    @When("Choose For Whom {string}")
    public void choose_for_whom(String ForWhom) throws InterruptedException {
        pageClass.chooseforwhom(ForWhom);
    }
    @When("Choose The Actions {string}")
    public void choose_the_actions(String Actions) throws InterruptedException {
        pageClass.actiondd(Actions);
    }

    @Then("Verify The Filtered Results")
    public void verify_the_filtered_results() {


    }


}
