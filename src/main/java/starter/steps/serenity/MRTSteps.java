package starter.steps.serenity;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import starter.pages.MRTPage;
import org.assertj.core.api.Assertions;

public class MRTSteps extends UIInteractionSteps {

    private MRTPage mrtPage;

    @Step("Open radiology page")
    public void open_radiology_page() {
        mrtPage.open();
    }

    @Step("Click MRT in main menu")
    public void click_MRT_in_main_menu() {
        mrtPage.openMrtBlock();
    }

    @Step("Check the items count is 10")
    public void check_the_items_count_is_10() {
        int size = mrtPage.getSubItems().size();
        Assertions.assertThat(size).isEqualTo(10);
    }

   /* @Step("the user clicks the item (\\d+)")
    public void click_subitem_in_menu(int itemIndex) {
        mrtPage.clickSubItem(itemIndex).click();
    }*/

    @Step("Check the name is (\\.*) ")
    public void check_the_tab_contains_num(String num) {
        String temp = mrtPage.getSubItemClickingResult().get(0).getText();
        temp = temp.substring(2);
        Assertions.assertThat(num).isEqualTo(temp);
    }
    @Step("Click the item (\\.*) ")
    public void click_the_menu_item(String itemIndex) {
        int index=Integer.parseInt(itemIndex);
        index--;
        mrtPage.clickSubItem(index);

    }
}
