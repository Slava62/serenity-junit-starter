package starter.invitro;



import io.cucumber.java.en.Given;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import starter.steps.cucumber.MRTStepsDefinitions;
import starter.steps.serenity.MRTSteps;

/**
 * UIInteractionSteps let us define action classes which regroup related actions.
 * The @Step annotation is used to indicate that this action will appear as a step in the reports.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/clicking_the_main_menu_items/MRT",
        glue = "starter.steps.cucumber")
//@RunWith(SerenityRunner.class)
public class MrtTestSuite {


   /* @Given("User clicks MRT in main menu")
    public void userClicksMRTInMainMenu() {
       mrtSteps.open_mrt_page();
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
    }*/
}
