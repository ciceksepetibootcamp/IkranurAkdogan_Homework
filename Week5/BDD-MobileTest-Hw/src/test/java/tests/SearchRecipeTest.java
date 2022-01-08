package tests;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.net.MalformedURLException;

public class SearchRecipeTest extends BaseTest {

    @Given("Kullanıcı Anasayfaya Gelir")
    public void goToHomePage() throws InterruptedException, MalformedURLException {
        setup();
        By el_Basla = By.id("btHemenBasla");
        wait.until(ExpectedConditions.visibilityOfElementLocated(el_Basla)).click();
    }

    @When("Kullanıcı menüye gelir tarif araya tıklayarak {string} tarifini aratır ve adımları takip eder")
    public void searchItemRecipeTest(String keyword) throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        homePage.searchRecipe(keyword);

    }

    @Then("Kullanıcı arama sonuçlarını görür")
    public void sawSearchResultsTest() throws InterruptedException {

    }

    @And("Kullanıcı arama sonuçlarını gördükten sonra geriye giderek anasayfaya gelir ve tekrar menüden tarif araya tıklayarak arama sonuçlarından aranan kelimeyi siler")
    public void deleteItemRecipeTest() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        homePage.deleteSearchRecipe();

    }

    @Then("Arama sonuçlarında aranan kelimenin silindiğini ve {string} yazısını görür")
    public void sawSearchResultsBeforeTest(String message) throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.sawSearhRecipeBefore(message);
    }


}