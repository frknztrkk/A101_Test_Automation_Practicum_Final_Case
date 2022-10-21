import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fill_the_email_click_login() {
        type(By.xpath("//input[@id='txtUserName']"),"furkanqatest@gmail.com");
        click(By.xpath("//button[@id='btnLogin']"));
    }
}
