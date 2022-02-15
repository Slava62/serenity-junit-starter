package starter.invitro;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

/**
 * UIInteractionSteps let us define action classes which regroup related actions.
 * The @Step annotation is used to indicate that this action will appear as a step in the reports.
 */
public class NavigateActions extends UIInteractions {

    //@Step("Navigate to the home page")
    //public void toTheHomePage() {
   //     openUrl("https://www.invitro.ru/");
  // }

    @Given("User clicks MRT in main menu")
    public void userClicksMRTInMainMenu() {
    }

    @When("he is not registered")
    public void heIsNotRegistered() {
    }

    @Then("MRT sub items is shown")
    public void mrtSubItemsIsShown() {
    }

    @And("MRT blocks are shown on the page")
    public void mrtBlocksAreShownOnThePage() {
    }
}
