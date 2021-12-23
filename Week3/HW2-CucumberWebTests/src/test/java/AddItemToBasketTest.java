import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemToBasketTest {
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

    @Given("Kullanıcı anasayfaya gider")
    public void kullanıcıAnasayfayaGider() {
        driver.get("https://www.hepsiburada.com/");

    }

    @When("Anasayfadan bir ürüne girer ve sepete ekleye tıklar")
    public void anasayfadanBirÜrüneGirerVeSepeteEkleyeTıklar() {

        driver.findElement(By.cssSelector(".slick-slide:nth-child(5) .sf-dod-gxYgqs")).click();
        driver.findElement(By.id("addToCart")).click();
    }


    @Then("Ürün sepete eklendi yazısı içeren bir popup görür")
    public void ürünSepeteEklendiYazısıIçerenBirPopupGörür() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[contains(@class, 'checkoutui-SalesFrontCash-XeG2a')]"));


    }
}
