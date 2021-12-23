import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToFavoritesNegativeTest {

    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


    }
    @Given("Kullanıcı anasayfaya girer")
    public void kullanıcıAnasayfayaGirer() {
        driver.get("https://www.hepsiburada.com/");

    }

    @When("Anasayfadan bir ürüne girer ve favorilere eklemeye çalışarak kalp emojisine basılır")
    public void anasayfadanBirÜrüneGirerVeFavorilereEklemeyeÇalışarakKalpEmojisineBasılır() {
        driver.findElement(By.cssSelector(".slick-slide:nth-child(5) .sf-dod-gxYgqs")).click();
        driver.findElement(By.cssSelector(".customerAccount-Like-2wPzH")).click();

    }

    @Then("Kullanıcı login işlemine yönlendirildiği bir sayfa görür")
    public void kullanıcıLoginIşlemineYönlendirildiğiBirSayfaGörür() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.id("btnGoogle"));

    }
    @After
    public void tearDown(){
        driver.quit();
    }


}
