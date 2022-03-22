package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.invitro.ru/radiology/mrt/")
public class MRT extends PageObject {
    public MRT(WebDriver driver) {
        super(driver);
    }
}
