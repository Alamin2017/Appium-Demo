package testCases;
import EnvSetup.BaseEnv;
import Utility.ElementActions;
import org.testng.annotations.Test;
import pageobject.Locator;
public class TestDemo extends BaseEnv {
    @Test
    public void test() throws InterruptedException {
        ElementActions.clickElement(Locator.sign_in_button_locator);
        Thread.sleep(12000);
        driver.navigate().back();
        Thread.sleep(2000);
    }
}
