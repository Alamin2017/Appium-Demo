package EnvSetup;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseEnv {
    public static AndroidDriver driver;
    @BeforeSuite
    public void AppInstall() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AndroidDriver(url,cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.installApp("E:\\Soft\\Android_Automation\\mygp.apk");
        Thread.sleep(2000);
    }
    @BeforeMethod
    public void AppOpen() throws InterruptedException {
        Thread.sleep(2000);
        driver.activateApp("com.portonics.mygp");
        Thread.sleep(2000);
    }
    @AfterMethod
    public void AppClose() throws InterruptedException {
        Thread.sleep(2000);
        driver.terminateApp("com.portonics.mygp");
        Thread.sleep(2000);
    }
    @AfterSuite
    public void AppUninstall() throws InterruptedException {
        Thread.sleep(2000);
        driver.removeApp("com.portonics.mygp");
        Thread.sleep(2000);
    }
}
