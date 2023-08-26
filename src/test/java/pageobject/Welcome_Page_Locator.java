package pageobject;
import org.openqa.selenium.By;
import Utility.ElementActions;
public class Welcome_Page_Locator {
    public static By sign_in_locator=By.id("com.portonics.mygp:id/btn");
    public static void clickSignInButton() {
        ElementActions.clickElement(sign_in_locator);
    }
}
