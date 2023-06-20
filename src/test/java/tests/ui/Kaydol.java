package tests.ui;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.PossPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Kaydol {

    @Test
    public void pozitifTest() throws InterruptedException {
        //https://mors-pos-app.onrender.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("poss_url"));
//Kayıtoluşturma
        PossPage possPage=new PossPage();

        ReusableMethods reusableMethods=new ReusableMethods();
        Thread.sleep(2000);
        reusableMethods.jsExecutorScrool(possPage.kaydol);
        reusableMethods.jsExecutorScrool(possPage.kullanıcıAdı);
        Thread.sleep(2000);
        possPage.kullanıcıAdı.sendKeys(ConfigReader.getProperty("user"));
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("email")).
                sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).
                sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("passwordTekrar")).
                sendKeys(Keys.ENTER).perform();



        Thread.sleep(2000);

        reusableMethods.jsExecutorScrool(possPage.girisEmailAdresi);
        possPage.kullanıcıAdı.sendKeys(ConfigReader.getProperty("email"));
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).
                sendKeys(Keys.ENTER).perform();



    }

}
