package testCases;
import EnvSetup.BaseEnv;
import org.testng.annotations.Test;
import pageobject.Welcome_Page_Locator;
public class Test_Module_001 extends BaseEnv {
    @Test
    public void testMyGP() throws InterruptedException {
        Thread.sleep(3000);
        driver.activateApp("com.portonics.mygp");
        Thread.sleep(3000);
        Welcome_Page_Locator.clickSignInButton();
        Thread.sleep(13000);
        driver.navigate().back();
        driver.terminateApp("com.portonics.mygp");
        Thread.sleep(3000);

    }
}
