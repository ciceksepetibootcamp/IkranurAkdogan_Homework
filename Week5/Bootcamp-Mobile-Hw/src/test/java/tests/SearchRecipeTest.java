package tests;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class SearchRecipeTest extends BaseTest {

    @Test(priority = 1)
    public void searchItemRecipeTest() throws InterruptedException {

        By el_Basla = By.id("btHemenBasla");
        wait.until(ExpectedConditions.visibilityOfElementLocated(el_Basla)).click();
        HomePage homePage = new HomePage(driver);
        homePage.searchRecipe("mantı");

    }

    @Test(priority = 2)
    public void deleteItemRecipeTest() throws InterruptedException {

        searchItemRecipeTest();
        HomePage homePage = new HomePage(driver);
        homePage.deleteSearchRecipe();

    }


}