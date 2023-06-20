package tests.ui;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PossPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class SepeteUrunEkle {
    @Test
    public void pozitifTest2() throws InterruptedException {
        //https://mors-pos-app.onrender.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("poss_url"));
        //Kayıtoluşturma
        PossPage possPage=new PossPage();

        ReusableMethods reusableMethods=new ReusableMethods();
        Faker faker=new Faker();
        reusableMethods.jsExecutorScrool(possPage.girisEmailAdresi);
        possPage.kullanıcıAdı.sendKeys(ConfigReader.getProperty("email"));
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).
                sendKeys(Keys.ENTER).perform();

        //kullanıcı tüm ürünlere gelir
        reusableMethods.jsExecutorScrool(possPage.tumu);
        Thread.sleep(2000);
        //kullanıcı gelen ilk ürüne tıklar

        possPage.urunler.get(0).click();

        //kullanıcı sepette ekledigi ürünü görür
        Thread.sleep(2000);
        Assert.assertTrue(possPage.urünSepeteEklendi.isDisplayed());

        //Kullanıcı siparis Olusturur

        possPage.siparisOlustur.click();
        Thread.sleep(2000);

        possPage.siparisOlustur.click();

        possPage.customerName.sendKeys(faker.name().fullName());
        Thread.sleep(2000);
        possPage.customerphone.sendKeys(faker.phoneNumber().cellPhone());
        possPage.paymentMode.click();
        Thread.sleep(2000);
        possPage.nakit.click();
        possPage.siparisOlustur2.click();

        Assert.assertFalse(possPage.faturalar.getText().isEmpty(),"test gecti");

    }}




