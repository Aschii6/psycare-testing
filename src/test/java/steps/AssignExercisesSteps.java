package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignExercisesSteps {
    @When("the psychologist has selected assignments and mapped clients and,or patients")
    public void psychologist_selected_assignments_clients_patients() {
        IO.println("Psychologist has selected assignments and mapped clients and/or patients");
    }

    @When("they assign the exercises")
    public void psychologist_assigns_exercises() {
        IO.println("Psychologist assigns the exercises");
    }

    @Then("the assignment occurs")
    public void assignment_occurs() {
        IO.println("The assignment occurs");
    }

    @And("the assignments will appear for the clients and patients")
    public void assignments_appear_for_clients_patients() {
        IO.println("The assignments will appear for the clients and patients");
    }
}
