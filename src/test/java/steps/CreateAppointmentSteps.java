package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAppointmentSteps {
    @Given("the psychologist completed the appointment data")
    public void psychologist_completed_appointment_data() {
        IO.println("Psychologist has completed the appointment data");
    }

    @And("the psychologist invited clients, patients, or both to participate")
    public void psychologist_invited_participants() {
        IO.println("Psychologist has invited clients, patients, or both to participate");
    }

    @When("they try to create the appointment")
    public void psychologist_creates_appointment() {
        IO.println("Psychologist is creating the appointment");
    }

    @Then("the appointment is created")
    public void appointment_is_created() {
        IO.println("The appointment has been successfully created");
    }
}
