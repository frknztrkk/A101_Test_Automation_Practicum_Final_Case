package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Locale;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public static String productOwner11;
    public static String productOwner22;
    public static String productName;


    public void add_product_to_cart() {
        switchDriver(1);
        click(By.xpath("//button[@id='addToCart']"));
        waitForElementsToBeClickable(driver,By.cssSelector(".checkoutui-Modal-2iZXl"),30).click();
        waitForElementsToBeClickable(driver,By.xpath("//tbody/tr[1]/td[3]/div[1]/form[1]/button[1]"),30).click();
        productOwner11= find(By.cssSelector("span:nth-child(1) > span:nth-child(2) > a:nth-child(1)")).getText().toLowerCase(Locale.ENGLISH);
        List<WebElement> allProducts = findAll(By.xpath("//a[@class='merchantStore small']"));
        productOwner22= allProducts.get(0).getText().toLowerCase(Locale.ENGLISH);
        productName=find(By.xpath("//h1[@id='product-name']")).getText();


    }

    public void go_to_cart() {
        waitForElementsToBeClickable(driver,By.xpath("//button[normalize-space()='Sepete git']"),15).click();

    }

}
