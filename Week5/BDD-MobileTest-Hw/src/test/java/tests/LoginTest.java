package tests;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.net.MalformedURLException;

public class LoginTest extends BaseTest {
    public LoginPage loginPage = new LoginPage(driver);


    @Given("Kullanıcı Anasayfaya Gider")
    public void kullanıcıAnasayfayaGider() throws MalformedURLException {
        setup();
    }


    @When("Menüye girer ve Giriş yapa tıklayarak {string} ve doğru {string} ile login işlemi yapar")
    public void validPasswordLoginTest(String email, String password) throws InterruptedException {

        loginPage.loginWithCredentials(email, password);

    }


    @Then("Anasayfaya giriş yaptığını görür")
    public void anasayfayaGirişYaptığınıGörür() throws InterruptedException {
        loginPage.checkHomePage();


    }

    @When("Menüye girer ve Giriş yapa tıklayarak {string} ve yanlış {string} ile login işlemi yapar")
    public void wrongPasswordLoginTest(String email, String password) {

        loginPage.loginWithCredentials(email, password);
    }

    @Then("Anasayfaya giriş yapamaz ve uyarı mesajı görür")
    public void uyarıMesajıGörür() throws InterruptedException {

        loginPage.checkErrorMessage("Kullanıcı adı veya şifre geçersiz.");

    }
}
