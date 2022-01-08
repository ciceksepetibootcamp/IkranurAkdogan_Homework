package tests;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.net.MalformedURLException;

public class MyRecipeTest extends BaseTest {
    public LoginPage loginPage = new LoginPage(driver);
    public HomePage homePage = new HomePage(driver);


    @Given("Kullanıcı Anasayfaya Ulasır")
    public void kullanıcıAnasayfayaUlasır() throws MalformedURLException {
        setup();
    }

    @When("Menüye girerek Giriş yapa tıklar ve doğru şifre ile login işlemi gerceklestirir")
    public void loginForRecipeTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCredentials("ciceksepetics@gmail.com", "S1234cicek.")
                .checkHomePage();

    }

    @And("Tariflerime girerek yeni tarif oluştura tıklar ve bilgileri doldurarak tarifi yayınlaya tıklar")
    public void saveRecipeTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.sendMyRecipe("Türk Kahvesi", "Türk Kahvesi", "1 kaşık Türk Kahvesi ve 1 fincan su karıştırılır ve cezvede pişirilir.");

    }

    @Then("Kullanıcı fotoğraf yüklemesi gerektiği uyarı mesajını görür ve tarif taslak olarak keydedilir")
    public void saveRecipeMessageTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.sawImageMessage();

    }


    @And("Kullanıcı tariflerime gelerek bir tarifi silmek için butona basar")
    public void deleteRecipeTest() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        homePage.deleteMyRecipe();

    }

    @Then("Kullanıcı tarifin silindiğini görür")
    public void successDeleteRecipeTest() throws InterruptedException {

    }


}