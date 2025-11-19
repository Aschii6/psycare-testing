package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PsychologistViewJournalEntriesSteps {
    @Given("the psychologist has {string} as a mapped client or patient")
    public void psychologist_has_mapped_client(String client_name) {
        IO.println("The psychologist has " + client_name + " as a mapped client or patient");
    }

    @When("they open the client's or patient's journal history")
    public void open_client_journal_history() {
        IO.println("The psychologist opens the client's or patient's journal history");
    }

    @Then("they can see the history of journal entries {string}")
    public void see_journal_entry_history(String journal_entries) {
        IO.println("The psychologist can see the history of journal entries: " + journal_entries);
    }
}
