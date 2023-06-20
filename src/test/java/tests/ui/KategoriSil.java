package tests.ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PossPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class KategoriSil {



    @Test
    public void pozitifTest() throws InterruptedException {
        //https://mors-pos-app.onrender.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("poss_url"));
//KAtegori Olustur
        PossPage possPage = new PossPage();

        ReusableMethods reusableMethods = new ReusableMethods();
        reusableMethods.jsExecutorScrool(possPage.girisEmailAdresi);
        possPage.kullanıcıAdı.sendKeys(ConfigReader.getProperty("email"));
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).
                sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        reusableMethods.jsExecutorScrool(possPage.kategoriDüzenle);
        possPage.kategoriDüzenle.click();

        Thread.sleep(2000);
        reusableMethods.jsExecutorScrool(possPage.sil.get(0));
        possPage.sil.get(0).click();
        Driver.getDriver().switchTo().alert().accept();

      /*
       Thread.sleep(2000);
        Assert.assertTrue(possPage.kategoriBasarıylasilindi.isDisplayed());
       */



    }}
