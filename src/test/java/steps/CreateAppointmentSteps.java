package steps;

import io.cucumber.java.en.*;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

public class CreateAppointmentSteps {
    Optional<Boolean> detailsCompleted;
    Optional<Boolean> appointmentCreated;

    @Given("the psychologist completed the appointment data and invited participants")
    public void psychologist_completed_appointment_data_and_invited_participants() {
        IO.println("Psychologist has completed the appointment data and invited participants");
        detailsCompleted = Optional.of(true);
    }

    @Given("the psychologist has not completed the appointment data or invited participants")
    public void psychologist_not_completed_appointment_data_or_invited_participants() {
        IO.println("Psychologist has NOT completed the appointment data or invited participants");
        detailsCompleted = Optional.of(false);
    }

    @When("they try to create the appointment")
    public void psychologist_creates_appointment() {
        IO.println("Psychologist is creating the appointment");

        if (detailsCompleted.isEmpty()) {
            throw new IllegalStateException("Appointment details completion status is not set");
        } else {
            appointmentCreated = detailsCompleted;
        }
    }

    @Then("the appointment is created successfully")
    public void appointment_is_created() {
        IO.println("The appointment has been successfully created");
        appointmentCreated.ifPresent(
            created -> {
                assertThat(created).isTrue();
            }
        );
    }

    @Then("ensure a rejection message is displayed")
    public void appointment_is_not_created() {
        IO.println("A rejection message is displayed");
    }

    @But("the appointment is not created")
    public void appointment_not_created() {
        IO.println("The appointment has NOT been created");
        appointmentCreated.ifPresent(
            created -> {
                assertThat(created).isFalse();
            }
        );
    }
}
