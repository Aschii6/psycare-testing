package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MarkAttendanceSteps {
    @When("the psychologist is looking at a past session")
    public void psychologist_looking_at_past_session() {
        IO.println("Psychologist is viewing a past session.");
    }

    @And("the session attendance is marked with {string}")
    public void session_marked_with(String attendance_status) {
        IO.println("The session attendance is marked with: " + attendance_status);
    }

    @When("they select the new attendance {string}")
    public void select_new_attendance(String new_status) {
        IO.println("The psychologist selects the new attendance status: " + new_status);
    }

    @Then("the attendance of the session will be changed to {string}")
    public void attendance_will_be_changed(String new_status) {
        IO.println("The attendance of the session has been changed to: " + new_status);
    }
}
