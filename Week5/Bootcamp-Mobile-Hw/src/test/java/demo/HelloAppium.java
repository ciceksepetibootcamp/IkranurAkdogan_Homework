package demo;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HelloAppium {
    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("app", "C:\\Nefis Yemek Tarifleri_v0.6.253_apkpure.com.apk");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("fullReset", "true");
        caps.setCapability("noReset", "false");
        caps.setCapability("autoGrantPermissions", "true");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        //Open Appium driver
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30);
    }

    @Test
    public void basicText() throws InterruptedException {
        //Appium Recorder / Inspector Code

        By el_Basla = By.id("btHemenBasla");
        wait.until(ExpectedConditions.visibilityOfElementLocated(el_Basla)).click();
        MobileElement el_menu = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
        el_menu.click();
        MobileElement el6 = (MobileElement) driver.findElementById("nav_login");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementById("etKullaniciAdiEposta");
        el7.sendKeys("ciceksepetics@gmail.com");
        MobileElement el8 = (MobileElement) driver.findElementById("etParola");
        el8.sendKeys("S1234cicek.");
        MobileElement el9 = (MobileElement) driver.findElementById("btGirisYap");
        el9.click();
        Thread.sleep(5000);
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.ImageView");
        el2.click();
        MobileElement el99 = (MobileElement) driver.findElementById("tvYorumlar");
        el99.click();
        MobileElement el15 = (MobileElement) driver.findElementById("etTarifAdi");
        el15.sendKeys("Türk Kahvesi");
        MobileElement el16 = (MobileElement) driver.findElementById("spKacKisilik");
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementByXPath("//*[@text='1-2']");
        el17.click();
        MobileElement el179 = (MobileElement) driver.findElementById("spHazirlamaSuresi");
        el179.click();
        MobileElement el180 = (MobileElement) driver.findElementByXPath("//*[@text='5dk']");
        el180.click();

        //pişirme süresi alternatif çözüm çalışıyor:
        //MobileElement el172 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Spinner[3]/android.widget.TextView");
        //el172.click();
        MobileElement el172 = (MobileElement) driver.findElementById("spPisirmeSuresi");
        el172.click();
        MobileElement el173 = (MobileElement) driver.findElementByXPath("//*[@text='5dk']");
        el173.click();
        MobileElement el22 = (MobileElement) driver.findElementById("etMalzemeler");
        el22.sendKeys("Türk Kahvesi");
        Thread.sleep(4000);
        MobileElement el24 = (MobileElement) driver.findElementById("etHazirlanis");
        el24.sendKeys("1 kaşık Türk Kahvesi ve 1 fincan su karıştırılır ve cezvede pişirilir.");
        MobileElement el25 = (MobileElement) driver.findElementById("spKategori");
        el25.click();

        //Altrnatif kategori çözümü:
        //MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        //el1.click();
        // çigköfte: MobileElement el200 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
        //el200.click();
        MobileElement el200 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el200.click();
        MobileElement el26 = (MobileElement) driver.findElementById("btTaslakEkle");
        el26.click();
        MobileElement el27 = (MobileElement) driver.findElementById("checkBox1");
        el27.click();
        MobileElement el28 = (MobileElement) driver.findElementById("tvYayinaGonder");
        el28.click();

        MobileElement els11 = (MobileElement) driver.findElementByXPath("//*[@text='Tarifi yayına gönderebilmek için en az bir fotoğraf eklemiş olmalısınız.']");
        Assert.assertTrue(els11.getText().contains("Tarifi yayına gönderebilmek için en az bir fotoğraf eklemiş olmalısınız."));

        //kapat butonu:
        MobileElement el222 = (MobileElement) driver.findElementById("android:id/button1");
        el222.click();
        //------------------------------BURAYA KADAR LOGİN VE TARİF EKLİYOR--------------------------------------


        //tariflere gel
        MobileElement el2223 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.ImageView");
        el2223.click();
        MobileElement el_deleteRecipe = (MobileElement) driver.findElementById("ivBekleyenTarifRemove");
        el_deleteRecipe.click();
        MobileElement el_DeleteButton = (MobileElement) driver.findElementById("btDialogSil");
        el_DeleteButton.click();
        //------------------------------BURAYA KADAR LOGİN VE TARİF SİLİYOR---------------------------------------------


        Thread.sleep(5000);
        MobileElement el_Anasayfa = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]");
        el_Anasayfa.click();
        Thread.sleep(5000);
        //menüye gir
        el_menu.click();

        //Tarif araya tıkla
        MobileElement el_searChRecipe = (MobileElement) driver.findElementById("nav_tarif_ara");
        el_searChRecipe.click();
        MobileElement el_searchMain = (MobileElement) driver.findElementById("etSearchMain");
        el_searchMain.sendKeys("mantı");
        MobileElement el_searchIconButton = (MobileElement) driver.findElementById("search_icon_left");
        el_searchIconButton.click();
        MobileElement el_selectItem = (MobileElement) driver.findElementById("cvOneriler");
        By el_selectI = By.id("cvOneriler");
        wait.until(ExpectedConditions.visibilityOfElementLocated(el_selectI)).click();
        el_selectItem.click();
        Thread.sleep(8000);
        el_selectItem.click();
        Thread.sleep(8000);
        MobileElement el_kapatButton = (MobileElement) driver.findElementById("showcase_button");
        el_kapatButton.click();
        //----------------------------BURAYA KADAR YEMEK ARIYOR VE KAPATIYOR--------------------------------------

        Thread.sleep(8000);
        //REMOVE ARANAN
        MobileElement el_backButton = (MobileElement) driver.findElementByXPath("//*[@content-desc=\"Open navigation drawer\"]");
        el_backButton.click();
        el_backButton.click();

        //tekrar menüye gir ve tarifi araya gir
        el_menu.click();

        //Tarif araya tıkla
        MobileElement el_searChRecipe2 = (MobileElement) driver.findElementById("nav_tarif_ara");
        el_searChRecipe2.click();

        //arananı kaldır
        MobileElement el_removeFromList = (MobileElement) driver.findElementById("ivRemoveFromList");
        el_removeFromList.click();

        //Son aranan yok
        MobileElement el_KayitYokText = (MobileElement) driver.findElementById("tvKayitName");
        Assert.assertTrue(el_KayitYokText.getText().contains("Son aranan kelime yok"));
        //----------------------------YEMEK ARADIKTAN SONRA GERİ GİDİYOR VE ARANANLARDAN SİLİYOR----------------


    }

    @AfterMethod
    public void teardown() {

        driver.quit();
    }

}
