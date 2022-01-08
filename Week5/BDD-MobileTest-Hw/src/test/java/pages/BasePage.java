package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;

import java.net.MalformedURLException;
import java.sql.Driver;

public class BasePage {

    public AndroidDriver<MobileElement> driver;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;

    }

}
