package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class SearchForClientsPatientsSteps {
    @Given("the following clients patients exist in the system")
    public void the_clients_patients_exist(List<Map<String, String>> clientsPatients) {
        IO.println(clientsPatients.size() + " clients/Patients exist in the system");
    }

    @And("the psychologist completes the relevant search criteria {string}")
    public void psychologist_completes_search_criteria(String criteria) {
        IO.println("Psychologist completes search criteria: " + criteria);
    }

    @When("they initiate the search")
    public void psychologist_initiates_search() {
        IO.println("Psychologist initiates the search");
    }

    @Then("a list of users {string} is displayed")
    public void list_of_users_displayed(String expectedUsers) {
        IO.println("Expected to display: " + expectedUsers);
    }
}
