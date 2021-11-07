package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AccountPage;

public class AccountSteps {

    AccountPage account = new AccountPage();

    //--------- Feature Account ---------

    @Given("^I navigate to the login page$")
    public void navigateToEcommerce() {
        account.navigateToStore();
    }

    @When("^I select the Sign in option$")
    public void selectSignButton(){
        account.clickLoginAccount();
    }

    @And("^Enter my username and password$")
    public void enterAcces(){
        account.enterEmail("automationseleniumproyect@gmail.com");
        account.enterPassword("automation");
    }

    @And("^Click on the Sign in session button$")
    public void clickSignInButton(){
        account.clickLoginButton();
    }

    @Then("^Login to my account$")
    public void loginAccount(){
        Assert.assertEquals("Sign out", account.validateMyAccount());
    }

    @And("^I select the button Sign out$")
    public void closeMySession(){

        account.clickSignOut();
    }

    @Then("^The session is closed$")
    public void errorIsDisplayed(){
        Assert.assertTrue("No se visualiza el elemento", account.loginStatus());
    }

    //--------- Feature Account Validations ---------

    @And("^I fill in the mail field$")
    public void fillEmail(){
        account.enterEmail("automationseleniumproyect@gmail.com");
    }

    @Then("^A password validation is generated$")
    public void validatePassword(){
        account.clickLoginButton();
        Assert.assertTrue("No se visualiza el elemento", account.errorPasswordDisplayed());
    }

    @And("^I fill in the password field$")
    public void fillPassword(){
        account.enterPassword("incorrecto");
    }

    @Then("^A email validation is generated$")
    public void validateEmail(){
        account.clickLoginButton();
        Assert.assertTrue("No se visualiza el elemento", account.errorEmailDisplayed());
    }

    @And("^I fill in the email and password field with an incorrect values$")
    public void wrongEmail(){
        account.enterEmail("emailincorrecto@gmail.com");
        account.enterPassword("automation");
        account.clickLoginButton();
    }

    @Then("^An authentication validation is generated$")
    public void wrongEmailValidate(){
        Assert.assertTrue("No se visualiza el elemento", account.emailErrorAutentification());
    }

    @And("^I fill in the password field with an incorrect value$")
    public void wrongEmailError(){
        account.enterPassword("autoaaamation");
        account.clickLoginButton();
    }









}


