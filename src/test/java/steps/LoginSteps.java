package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("the user has filled in the email")
    public void user_filled_email() {
        IO.println("User has filled in the email");
    }

    @And("the user has filled in the password")
    public void user_filled_password() {
        IO.println("User has filled in the password");
    }

    @When("they try to login with {string} and {string}")
    public void user_presses_login(String email, String password) {
        IO.println("User presses login with email: " + email + " and password: " + password);
    }

    @Then("the login is {string}")
    public void login_result(String success_status) {
        IO.println("Login result should be: " + success_status);
    }
}
