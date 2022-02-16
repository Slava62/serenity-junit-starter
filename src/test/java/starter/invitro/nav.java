package starter.invitro;

import net.serenitybdd.core.steps.UIInteractionSteps;
//import net.thucydides.core.annotations.Step;

public class nav extends UIInteractionSteps {
 MRT mrt;

 //@Step("Open mrt page")
 public void theDuckDuckGoHomePage() {
    mrt.open();
 }
}
