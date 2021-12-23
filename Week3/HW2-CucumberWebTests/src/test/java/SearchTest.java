import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("Kullanıcı anasayfayı ziyaret eder")
    public void kullanıcıAnasayfayıZiyaretEder() {
        driver.get("https://www.hepsiburada.com/");
    }

    @When("Arama kutusuna {string} yazıp arattığında")
    public void aramaKutusunaYazıpArattığında(String keyword) {
        WebElement searchInput = driver.findElement(By.xpath("//input[@placeholder='Ürün, kategori veya marka ara']"));
        searchInput.click();
        searchInput.sendKeys(keyword);
        searchInput.sendKeys(Keys.ENTER);

    }

    @Then("Arama sonuçlarında {string} görmelidir")
    public void aramaSonuçlarındaGörmelidir(String keyword) throws InterruptedException {
        Thread.sleep(10000);
        String breadCrumbElement = "//h1[contains(text(),'" + keyword + "')]";
        System.out.println(breadCrumbElement);
        Assert.assertTrue(driver.findElement(By.xpath(breadCrumbElement)).getText().contains(keyword));
    }

}
