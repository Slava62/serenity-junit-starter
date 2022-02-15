package starter.invitro;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;

@DefaultUrl("https://www.invitro.ru/radiology/")
public class MRT extends PageObject {

    public void mrtClik(String keyword) {
        $("//li/*[@href=\"/radiology/mrt/\"").click();
    }
}
