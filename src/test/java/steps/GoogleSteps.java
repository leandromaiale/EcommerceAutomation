package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^Navigate to Google$")
    public void navigateToGoogle(){
        google.navigateToGoogle();

    }

    @When("^Login a word$")
    public void enterSearchCriteria(){
        google.enterSearchCriteria("Julian Alvarez");
        google.clickGoogleSearch();
    }

    @Then("Assert results")
    public void assertResults(){

    }


}
