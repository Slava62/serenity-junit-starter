package starter.invitro;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;

@DefaultUrl("https://www.invitro.ru")
public class MRT extends PageObject {

    public void openBasePage(){
        openAt("/radiology");
    }

    public void mrtClick() {
        $("//li/*[@href=\"/radiology/mrt/\"").click();
    }

}
