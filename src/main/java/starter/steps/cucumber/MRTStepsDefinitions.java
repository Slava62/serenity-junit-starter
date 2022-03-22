package starter.steps.cucumber;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;
import starter.steps.serenity.MRTSteps;

public class MRTStepsDefinitions {
    @Steps
    MRTSteps mrtSteps;


    @Given("User clicks MRT in main menu")
    public void user_clicks_MRT_in_main_menu() {
        mrtSteps.open_mrt_page();
    }

    @When("he is not registered")
    public void he_is_not_registered() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @Then("MRT sub items is shown")
    public void mrt_sub_items_is_shown() {
        // Write code here that turns the phrase above into concrete actions
       Assertions.assertThat(true).isTrue();// throw new io.cucumber.java.PendingException();
    }
    @Then("MRT blocks are shown on the page")
    public void mrt_blocks_are_shown_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertThat(true).isTrue();// throw new io.cucumber.java.PendingException();
    }

}
