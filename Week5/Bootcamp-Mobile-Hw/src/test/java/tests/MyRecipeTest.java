package tests;

import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class MyRecipeTest extends BaseTest {

    @Test(priority = 1)
    public void saveRecipeTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCredentials("ciceksepetics@gmail.com", "S1234cicek.")
                .checkHomePage();

        HomePage homePage = new HomePage(driver);
        homePage.sendMyRecipe("Türk Kahvesi", "Türk Kahvesi", "1 kaşık Türk Kahvesi ve 1 fincan su karıştırılır ve cezvede pişirilir.");

    }

    @Test(priority = 2)
    public void deleteRecipeTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCredentials("ciceksepetics@gmail.com", "S1234cicek.")
                .checkHomePage();

        HomePage homePage = new HomePage(driver);
        homePage.deleteMyRecipe();


    }


}