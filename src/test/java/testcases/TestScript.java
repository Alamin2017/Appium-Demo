package testcases;
import driversetup.BaseEnv;
import utilities.ElementAction;
import org.testng.annotations.Test;
import pagelocator.Locator;
public class TestScript extends BaseEnv {
    @Test
    public void test() throws InterruptedException {
        ElementAction.clickElement(Locator.sign_in_button_locator);
        Thread.sleep(12000);
        driver.navigate().back();
        Thread.sleep(2000);
    }
}
