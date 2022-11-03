package Pages;

import Data.configProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{
    By emailBoxLocator = By.xpath("//input[@id='txtUserName']");
    By emailSubmitButton = By.xpath("//button[@id='btnLogin']");
    By emailPasswordLocator=By.xpath("//input[@id='txtPassword']");
    By emailPswrdSubmitButton=By.xpath("//button[@id='btnEmailSelect']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fill_the_email_click_login() {//Config dosyasındaki mail alanı girildi ve tıklandı.

        type(emailBoxLocator, configProperties.property.getProperty("email"));
       click(emailSubmitButton);
    }

    public void fill_the_password_click_login() {//Config dosyasındaki mail şifresi alanı girildi ve tıklandı.
        type(emailPasswordLocator,configProperties.property.getProperty("emailPwd"));
        click(emailPswrdSubmitButton);
    }
}
