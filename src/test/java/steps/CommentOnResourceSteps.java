package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommentOnResourceSteps {
    @Given("the psychologist is reading a psychoeducational resource")
    public void psychologist_reading_resource() {
        IO.println("Psychologist is reading a psychoeducational resource");
    }

    @And("they wrote the comment they wish to leave")
    public void psychologist_wrote_comment() {
        IO.println("Psychologist wrote the comment they wish to leave");
    }

    @And("they select a comment to respond to")
    public void psychologist_selects_comment() {
        IO.println("Psychologist selects a comment to respond to");
    }

    @And("they wrote the response text")
    public void psychologist_wrote_response() {
        IO.println("Psychologist wrote the response text");
    }

    @When("they publish the comment")
    public void psychologist_publishes_comment() {
        IO.println("Psychologist publishes the comment");
    }

    @When("they publish the response")
    public void psychologist_publishes_response() {
        IO.println("Psychologist publishes the response");
    }

    @Then("the new comment will appear in the comment section of the resource")
    public void comment_appears_in_section() {
        IO.println("The new comment appears in the comment section of the resource");
    }

    @Then("the new response will appear under the comment")
    public void response_appears_under_comment() {
        IO.println("The new response appears under the comment");
    }
}
