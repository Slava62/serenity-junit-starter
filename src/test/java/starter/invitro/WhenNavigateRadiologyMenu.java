package starter.invitro;

import cucumber.api.CucumberOptions;
import net.serenitybdd.core.Serenity;
//import net.serenitybdd.core.steps.UIInteractionSteps;
//import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
//import net.thucydides.core.annotations.SingleBrowser;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue = "net.serenity_bdd.samples")
class WhenNavigateRadiologyMenu {

    /**
     * Define the webdriver instance to be used for these tests
     */
   // @Managed(driver = "chrome", options = "headless")
    //WebDriver driver;

    /**
     * Navigation actions. This is a UIInteraction class so it will be instantiated automatically by Serenity.
     */
    NavigateActions navigate;

    /**
     * Actions related to searches. This is a UIInteraction class so it will be instantiated automatically by Serenity.
     */
  //  SearchActions search;

    /**
     * A page object representing a Wikipedia article that is currently appearing in the browser.
     * Page Objects are automatically initialised by Serenity.
     */
   // DisplayedArticle displayedArticle;

   // @Test
    void searchBySingleKeyword() {
        navigate.toTheHomePage();
        //search.searchBy("Everest");
        // Serenity.reportThat("The first heading should be 'AIDA64'",
        //         () -> assertThat(displayedArticle.getFirstHeading()).isEqualTo("AIDA64")
        // );
    }
}