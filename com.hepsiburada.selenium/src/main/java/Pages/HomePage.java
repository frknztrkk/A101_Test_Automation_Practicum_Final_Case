package Pages;

import Data.configProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    By cookieAcceptLocator= By.xpath("//button[@id='onetrust-accept-btn-handler']");
    By searchBoxLocator = By.xpath("//input[@class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']");
    By searchButtonLocator=By.xpath("//div[@class='SearchBoxOld-cHxjyU99nxdIaAbGyX7F']");
    By loginMenuButtonLocator= By.xpath("//span[@title='Giriş Yap']");
    By loginButtonLocator = By.xpath("//a[@id='login']");
    public HomePage(WebDriver driver) {
        super(driver);
    }



    public void click_login() {//Mouse menünün üstüne getirildi ve tıklandı.
        hoverOverElement(loginMenuButtonLocator);
        click(loginButtonLocator);
    }

    public void pass_the_cookie() {
        click(cookieAcceptLocator);
    }//Cookieler kabul edildi.

    public void search_and_click() {//Search box'a config dosyasındaki aranılacak değer yazdırıldı ve tıklandı.
        type(searchBoxLocator, configProperties.property.getProperty("searchText"));
        click(searchButtonLocator);
    }

    public String user_login_validation() {//Hesap doğrulanması için giriş yapıldıktan sonra element değişmesi kontrol edildi.
        String accountText = find(By.xpath("//div[2]/span[1]/a[1]/span[1]")).getText();
        if (accountText.equals("Hesabım")){
            System.out.println("Hesap Girisiniz Dogrulandı.");
        }
      return accountText;


    }
}

