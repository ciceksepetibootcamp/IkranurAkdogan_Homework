package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

        public AndroidDriver<MobileElement> driver;
        public WebDriverWait wait;

        public BasePage (AndroidDriver driver){
            this.driver= driver;
            wait = new WebDriverWait(driver, 35);

        }
}
