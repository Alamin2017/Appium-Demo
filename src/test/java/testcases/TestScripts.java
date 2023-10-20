package testcases;
import driversetup.BaseEnv;
import utilities.ElementActions;
import org.testng.annotations.Test;
import pagelocator.Locators;
public class TestScripts extends BaseEnv {
    @Test
    public void test() throws InterruptedException {
        ElementActions.clickElement(Locators.sign_in_button_locator);
        Thread.sleep(12000);
        driver.navigate().back();
        Thread.sleep(2000);
    }
}
