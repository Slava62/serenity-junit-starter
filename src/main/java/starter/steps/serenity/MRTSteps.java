package starter.steps.serenity;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import starter.pages.MRT;
//import net.thucydides.core.annotations.Step;

public class MRTSteps extends UIInteractionSteps {

    private MRT mrt;

 @Step("Open mrt page")
 public void open_mrt_page() {
    mrt.open();
 }
}
