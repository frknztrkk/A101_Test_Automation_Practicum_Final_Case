import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void click_login() {
        click(By.xpath("//span[@title='Giriş Yap']"));
        click(By.xpath("//a[@id='login']"));
    }

    public void pass_the_cookie() {
        click(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
    }
}

