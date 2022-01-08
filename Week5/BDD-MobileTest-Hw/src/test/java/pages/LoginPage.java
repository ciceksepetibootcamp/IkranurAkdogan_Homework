package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import tests.BaseTest;

import java.net.MalformedURLException;

public class LoginPage extends BaseTest {


    public LoginPage(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public LoginPage loginWithCredentials(String email, String password) {
        MobileElement el_Basla = (MobileElement) driver.findElementById("btHemenBasla");
        el_Basla.click();
        MobileElement el_menu = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
        el_menu.click();
        MobileElement el_GirisYapMenu = (MobileElement) driver.findElementById("nav_login");
        el_GirisYapMenu.click();
        MobileElement el_Email = (MobileElement) driver.findElementById("etKullaniciAdiEposta");
        el_Email.sendKeys(email);
        MobileElement el_Parola = (MobileElement) driver.findElementById("etParola");
        el_Parola.sendKeys(password);
        MobileElement el_girisButonu = (MobileElement) driver.findElementById("btGirisYap");
        el_girisButonu.click();
        return this;
    }

    public void checkErrorMessage(String textMsg) {
        MobileElement el_hataliGirisTest = (MobileElement) driver.findElementByXPath("//*[@text='Kullanıcı adı veya şifre geçersiz.']\n");
        Assert.assertTrue(el_hataliGirisTest.getText().contains(textMsg));

    }

    public void checkHomePage() {

    }
}
