package starter.invitro;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
//import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;

/**
 * UIInteractionSteps let us define action classes which regroup related actions.
 * The @Step annotation is used to indicate that this action will appear as a step in the reports.
 */
@RunWith(CucumberWithSerenity.class)
/*@CucumberOptions(
        features="src/test/resources/features",
        glue = "net.serenity_bdd.samples")*/
public class MRTActionsTestSuite {

    //@Step("Navigate to the home page")
    //public void toTheHomePage() {
   //     openUrl("https://www.invitro.ru/");
  // }
    @Steps
    nav nav;

    @Given("User clicks MRT in main menu")
    public void userClicksMRTInMainMenu() {
       // mrt.openBasePage();
       nav.theDuckDuckGoHomePage();
    }

    @When("he is not registered")
    public void heIsNotRegistered() {

    }

    @Then("MRT sub items is shown")
    public void mrtSubItemsIsShown() {
       // mrt.mrtClick();
    }

    @And("MRT blocks are shown on the page")
    public void mrtBlocksAreShownOnThePage() {
    }
}
