package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SessionPaymentManagementSteps {
    @Given("there exists at least a session")
    public void session_exists() {
        IO.println("At least one session exists in the system");
    }

    @And("the psychologist completes the relevant data for a new session payment")
    public void psychologist_completes_session_payment_data() {
        IO.println("Psychologist completes the relevant data for a new session payment");
    }

    @When("they create the session")
    public void psychologist_creates_session() {
        IO.println("Psychologist creates the session");
    }

    @Then("the session payment gets created")
    public void session_payment_created() {
        IO.println("The session payment gets created");
    }

    @And("the session payment is linked to the session")
    public void session_payment_linked_to_session() {
        IO.println("The session payment is linked to the session");
    }
}
