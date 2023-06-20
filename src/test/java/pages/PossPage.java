package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PossPage {
    public PossPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(className="text-blue-600")
    public WebElement kaydol;

    @FindBy(xpath="(//*[@class='ant-input css-26rdvq'])[1]")
    public WebElement kullanıcıAdı;

    @FindBy(xpath="//*[@id='email']")
    public WebElement girisEmailAdresi;

//siparis olusturma
    @FindBy(xpath="//*[text()='Tümü']")
     public WebElement tumu;

    @FindBy(className="product-img")
    public List <WebElement> urunler;

    @FindBy(xpath="//*[@class='cart-items px-2 flex flex-col gap-y-3 py-2 overflow-y-auto']")
    public WebElement sepettekiUrun;


    @FindBy(xpath="//*[text()='Ürün Sepete Eklendi']")
    public WebElement urünSepeteEklendi;

    @FindBy(xpath="//*[text()='Sipariş Oluştur']")
    public WebElement siparisOlustur;

    @FindBy(xpath="//*[@id='customerName']")
    public WebElement customerName;

    @FindBy(xpath="//*[@type='phone']")
    public WebElement customerphone;

    @FindBy(xpath="//*[@class='ant-select-selection-search']")
    public WebElement paymentMode;
    @FindBy(xpath="(//*[@title='Nakit'])[1]")
    public WebElement nakit;
    @FindBy(xpath="(//*[text()='Sipariş Oluştur'])[2]")
    public WebElement siparisOlustur2;
    @FindBy(xpath="//*[text()='Faturalar']")
    public WebElement faturalar;


    //Kategori Ekle

    @FindBy(xpath="//*[@class='card-item !bg-purple-800 hover:opacity-90']")
    public WebElement kategoriekleButonu;
    @FindBy(xpath="//*[@id='title']")
    public WebElement kategoriekle;
    @FindBy(xpath="//*[text()='Ekle']")
    public WebElement ekle;

    @FindBy(xpath="//*[text()='Kategori başarıyla eklendi']")
    public WebElement kategoriBasarıylaEklendi;


    //KAtegori Sil
    @FindBy(xpath="//*[@class='card-item !bg-orange-800 hover:opacity-90']")
    public WebElement kategoriDüzenle;

    @FindBy(xpath="(//*[text()='Sil'])[1]")
    public List <WebElement> sil;

    @FindBy(xpath="//*[text()='Kategori başarıyla silindi']")
    public WebElement kategoriBasarıylasilindi;



}
