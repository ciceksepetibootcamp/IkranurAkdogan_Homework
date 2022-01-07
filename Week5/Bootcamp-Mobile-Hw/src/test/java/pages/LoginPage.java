package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    public LoginPage loginWithCredentials(String email, String password) {
        By el_Basla = By.id("btHemenBasla");
        wait.until(ExpectedConditions.visibilityOfElementLocated(el_Basla)).click();
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
