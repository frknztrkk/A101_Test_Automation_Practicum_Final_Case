import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void add_product_to_cart() {
        switchDriver(1);
        List<WebElement> allProducts = findAll(By.xpath("//a[@class='merchantStore small']"));
        String productOwner2 = allProducts.get(0).getText();
        String productOwner1 = find(By.cssSelector(".hepsiburada.hbus")).getText();
        String productName= find(By.xpath("//h1[@id='product-name']")).getText();
        System.out.println(productName+productOwner1+productOwner2);
        click(By.xpath("//button[@id='addToCart']"));
        waitForElementsToBeClickable(driver,By.xpath("//a[@class='checkoutui-Modal-2iZXl']//*[name()='svg']"),15).click();
        click(By.xpath("//tbody/tr[1]/td[3]/div[1]/form[1]/button[1]"));

    }

    public void go_to_cart() {
        click(By.xpath("//button[normalize-space()='Sepete git']"));

    }
}
