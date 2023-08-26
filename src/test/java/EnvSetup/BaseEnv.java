package EnvSetup;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.net.MalformedURLException;
import java.net.URL;
public class BaseEnv {
    public static AndroidDriver driver;
    @BeforeSuite
    public void AppInstall() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.UDID, "RFCMB01Q39B");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AndroidDriver(url,cap);
        driver.installApp("E:\\Soft\\Android_Studio\\mygp.apk");
        Thread.sleep(3000);
    }
    @AfterSuite
    public void AppUnInstall() throws InterruptedException {
        Thread.sleep(3000);
        //driver.removeApp("com.portonics.mygp");
        Thread.sleep(3000);
    }
}
