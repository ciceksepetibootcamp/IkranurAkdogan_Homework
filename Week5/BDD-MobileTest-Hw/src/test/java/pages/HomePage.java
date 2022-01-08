package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import tests.BaseTest;
import java.net.MalformedURLException;


public class HomePage extends BaseTest {

    public HomePage(AppiumDriver<MobileElement> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }


    public HomePage sendMyRecipe(String tarifAdi, String malzemeler, String hazirlanis) throws InterruptedException {

        Thread.sleep(5000);
        MobileElement el_myRecipeImage = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.ImageView");
        el_myRecipeImage.click();
        Thread.sleep(4000);
        MobileElement el_yeniTarifGonder = (MobileElement) driver.findElementById("tvYorumlar");
        el_yeniTarifGonder.click();
        MobileElement el_tarifAdi = (MobileElement) driver.findElementById("etTarifAdi");
        el_tarifAdi.sendKeys(tarifAdi);
        MobileElement el_kacKisi = (MobileElement) driver.findElementById("spKacKisilik");
        el_kacKisi.click();
        MobileElement el_kacKisiSecilen = (MobileElement) driver.findElementByXPath("//*[@text='1-2']");
        el_kacKisiSecilen.click();
        MobileElement el_hazirlamaSuresi = (MobileElement) driver.findElementById("spHazirlamaSuresi");
        el_hazirlamaSuresi.click();
        MobileElement el_hazirlamaSuresiSecilen = (MobileElement) driver.findElementByXPath("//*[@text='5dk']");
        el_hazirlamaSuresiSecilen.click();

        /*pişirme süresi  alternatif çözüm-> çalışıyor:
        MobileElement el172 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Spinner[3]/android.widget.TextView");
        el172.click(); */
        MobileElement el_pisirmeSuresi = (MobileElement) driver.findElementById("spPisirmeSuresi");
        el_pisirmeSuresi.click();
        MobileElement el_pisirmeSuresiSecilen = (MobileElement) driver.findElementByXPath("//*[@text='5dk']");
        el_pisirmeSuresiSecilen.click();
        MobileElement el_malzeme = (MobileElement) driver.findElementById("etMalzemeler");
        el_malzeme.sendKeys(malzemeler);
        Thread.sleep(4000);
        MobileElement el_hazirlanis = (MobileElement) driver.findElementById("etHazirlanis");
        el_hazirlanis.sendKeys(hazirlanis);
        MobileElement el_kategori = (MobileElement) driver.findElementById("spKategori");
        el_kategori.click();

        /*Alternatif çözüm kategori:
        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        el1.click();
        çigköfte: MobileElement el200 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
        el200.click();*/

        MobileElement el_kategoriSecilen = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el_kategoriSecilen.click();
        MobileElement el_taslakEkle = (MobileElement) driver.findElementById("btTaslakEkle");
        el_taslakEkle.click();
        MobileElement el_checkbox = (MobileElement) driver.findElementById("checkBox1");
        el_checkbox.click();
        MobileElement el_yayinaGonder = (MobileElement) driver.findElementById("tvYayinaGonder");
        el_yayinaGonder.click();

        return this;
    }

    public HomePage sawImageMessage() throws InterruptedException {
        MobileElement el_uyariMesaji = (MobileElement) driver.findElementByXPath("//*[@text='Tarifi yayına gönderebilmek için en az bir fotoğraf eklemiş olmalısınız.']");
        Assert.assertTrue(el_uyariMesaji.getText().contains("Tarifi yayına gönderebilmek için en az bir fotoğraf eklemiş olmalısınız."));

        //kapat butonu:
        MobileElement el_UyariMesajiKapat = (MobileElement) driver.findElementById("android:id/button1");
        el_UyariMesajiKapat.click();
        return this;
    }

    public HomePage deleteMyRecipe() throws InterruptedException {

        //tariflere gelir:
        MobileElement el_tarifSec = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.ImageView");
        el_tarifSec.click();
        MobileElement el_deleteRecipe = (MobileElement) driver.findElementById("ivBekleyenTarifRemove");
        el_deleteRecipe.click();
        MobileElement el_DeleteButton = (MobileElement) driver.findElementById("btDialogSil");
        el_DeleteButton.click();
        return this;
    }


    public HomePage searchRecipe(String searchingRecipe) throws InterruptedException {

        //menüye gir:
        MobileElement el_menu = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
        el_menu.click();
        Thread.sleep(5000);
        //Tarif araya tıkla:
        MobileElement el_searChRecipe = (MobileElement) driver.findElementById("nav_tarif_ara");
        el_searChRecipe.click();
        Thread.sleep(15000);

        MobileElement el_searchMain = (MobileElement) driver.findElementById("etSearchMain");
        el_searchMain.sendKeys(searchingRecipe);
        MobileElement el_searchIconButton = (MobileElement) driver.findElementById("search_icon_left");
        el_searchIconButton.click();
        Thread.sleep(15000); //sSİL
        //Alternatif= Aranan mantı tarifi için mantıyı seçer:
        ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.appcompat.widget.LinearLayoutCompat
        MobileElement el_selectItem = (MobileElement) driver.findElementById("cvOneriler");
        el_selectItem.click();
        MobileElement el_kapatButton = (MobileElement) driver.findElementById("showcase_button");
        el_kapatButton.click();

        return this;
    }

    public HomePage deleteSearchRecipe() throws InterruptedException {

        MobileElement el_menu = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
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

        return this;
    }

    public HomePage sawSearhRecipeBefore(String message) throws InterruptedException {
        //Son aranan yok
        MobileElement el_KayitYokText = (MobileElement) driver.findElementById("tvKayitName");
        Assert.assertTrue(el_KayitYokText.getText().contains(message));
        return this;

    }

}


