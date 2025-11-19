package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MoodSelectionSteps {
    @Given("the list of possible moods")
    public void the_list_of_possible_moods(List<String> moods) {
        IO.println("Possible moods: " + moods.size());
    }

    @And("the client or patient is recording a journal entry")
    public void recording_journal_entry() {
        IO.println("Client or Patient is recording a journal entry.");
    }

    @When("they select the mood {string}")
    public void select_mood(String mood) {
        IO.println("The selected mood is: " + mood);
    }

    @Then("the mood {string} gets saved for the corresponding journal entry")
    public void mood_gets_saved(String mood) {
        IO.println("The mood " + mood + " has been saved for the journal entry.");
    }
}
