package starter.steps.cucumber;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.serenity.MRTSteps;

public class MRTStepsDefinitions {
    @Steps
    MRTSteps mrtSteps;


    @Given("user opens radiology page")
    public void user_opens_radiology_page() {
        mrtSteps.open_radiology_page();;
    }

    @When("the user clicks MRT in menu")
    public void user_clicks_MRT_in_menu() {
        mrtSteps.click_MRT_in_main_menu();
    }

    @Then("the user sees 9 sub items")
    public void mrt_sub_items_are_shown() {
       mrtSteps.check_the_items_count_is_10();
    }

    @Then("the user gets the page named {string}")
    public void the_user_gets_the_page_named(String page) {
        mrtSteps.check_the_tab_contains_num(page);
    }

    @And("the user clicks the item {string}")
    public void the_user_clicks_the_item(String itemIndex) {
        mrtSteps.click_the_menu_item(itemIndex);
    }
}
