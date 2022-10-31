package Pages;

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

    public void fill_the_email_click_login() {

        type(emailBoxLocator,"furkanqatest@gmail.com");
       click(emailSubmitButton);
    }

    public void fill_the_password_click_login() {
        type(emailPasswordLocator,"Qaqaqaqa1");
        click(emailPswrdSubmitButton);
    }
}
