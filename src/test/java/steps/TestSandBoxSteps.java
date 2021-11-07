package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TestSandBox;

public class TestSandBoxSteps {

    TestSandBox sandBoxPage = new TestSandBox();

    @Given("I navigate to the sandbox page")
    public void navigateToSandBox(){
        sandBoxPage.navigateToSandBox();
    }

    @And("select a value from the dropdown")
    public void selectState(){
        sandBoxPage.selectCategory("Manual");
    }
}
