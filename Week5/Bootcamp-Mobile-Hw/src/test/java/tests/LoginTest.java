package tests;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test(priority = 2)
    public void wrongPasswordLoginTest()  {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCredentials("ciceksepetics@gmail.com","S1234cicekk")
                .checkErrorMessage("Kullanıcı adı veya şifre geçersiz.");
    }

    @Test(priority = 1)
    public void validPasswordLoginTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCredentials("ciceksepetics@gmail.com","S1234cicek.")
                .checkHomePage();

    }
}
