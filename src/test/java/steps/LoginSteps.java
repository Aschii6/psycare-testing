package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps {
    List<Map<String, String>> accountDatabase;
    String email;
    String password;
    boolean credentialsCorrect;

    @Given("the account database is")
    public void account_database_is(List<Map<String, String>> accountDatabase) {
        IO.println("Account database initialized with the following data:");
        for (Map<String, String> account : accountDatabase) {
            IO.println("Email: " + account.get("email") + ", Password: " + account.get("password"));
        }
        this.accountDatabase = accountDatabase;
    }

    @And("the user has filled in the email with {string}")
    public void user_fills_in_email(String email) {
        IO.println("User fills in email: " + email);
        this.email = email;
    }

    @And("the user has filled in the password with {string}")
    public void user_fills_in_password(String password) {
        IO.println("User fills in password: " + password);
        this.password = password;
    }

    private Map.Entry<String, String> findAccountByEmail(String email) {
        for (Map<String, String> account : accountDatabase) {
            if (account.get("email").equals(email)) {
                return Map.entry(account.get("email"), account.get("password"));
            }
        }
        return null;
    }

    @When("they try to login")
    public void user_tries_login() {
        IO.println("User tries to login");

        Map.Entry<String, String> account = findAccountByEmail(email);
        if (account != null && account.getValue().equals(password)) {
            credentialsCorrect = true;
            IO.println("Credentials are correct");
        } else {
            credentialsCorrect = false;
            IO.println("Credentials are incorrect");
        }
    }

    @Then("the login is {string}")
    public void login_result(String success_status) {
        IO.println("Login result should be: " + success_status);
        if (credentialsCorrect) {
            assertThat(success_status).isEqualTo("successful");
        } else {
            assertThat(success_status).isEqualTo("unsuccessful");
        }
    }
}
