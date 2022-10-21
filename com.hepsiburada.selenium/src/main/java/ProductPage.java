import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void add_product_to_cart() {
        switchDriver(1);
        click(By.xpath("//button[@id='addToCart']"));
        waitForElementsToBeClickable(driver,By.xpath("//a[@class='checkoutui-Modal-2iZXl']//*[name()='svg']"),15).click();
        click(By.xpath("//tbody/tr[1]/td[3]/div[1]/form[1]/button[1]"));
    }
}
