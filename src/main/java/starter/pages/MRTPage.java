package starter.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("https://www.invitro.ru/radiology")
public class MRTPage extends PageObject {

    String subItemClickingLocator=".result-item__number";

    String tabBlocks=".tab-block  .side-bar-second__items";
    String mrtBlock=tabBlocks + " a[href*=\"/radiology/mrt/\"]";

    public void openMrtBlock() {
        $$(tabBlocks).get(0).click();
    }

    public List<WebElementFacade> getSubItems(){
        return $$(mrtBlock);
    }

    public void clickSubItem(int Index){
       $$(mrtBlock).get(Index).click();
    }

    public List<WebElementFacade> getSubItemClickingResult(){
        return $$(subItemClickingLocator);
    }


    
}
