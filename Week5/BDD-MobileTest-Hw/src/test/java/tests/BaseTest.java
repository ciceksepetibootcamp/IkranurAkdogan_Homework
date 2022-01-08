package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static AndroidDriver<MobileElement> driver;
    public static WebDriverWait wait;

    @BeforeClass
    public static void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("app", "C:\\Nefis Yemek Tarifleri_v0.6.253_apkpure.com.apk");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("fullReset", "true");
        caps.setCapability("noReset", "false");
        caps.setCapability("autoGrantPermissions", "true");
        //caps.setCapability("appPackage", "com.android.google");
        //caps.setCapability("appActivity", "com.android.google....");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        //Open Appium driver
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 35);
    }

    @AfterClass
    public void teardown() {
        //driver.close();
        driver.quit();
        //Close Appium driver
    }
}


