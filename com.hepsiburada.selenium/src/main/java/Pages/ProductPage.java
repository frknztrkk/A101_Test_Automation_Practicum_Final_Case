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
    By addToCartLocator = By.xpath("//button[@id='addToCart']");
    By closePopupLocator= By.xpath("//div[1]/div[1]/h1[1]/a[1]");
    By otherSellerAddToCartLocator= By.xpath("//tbody/tr[1]/td[3]/div[1]/form[1]/button[1]");
    By productOwner1Locator = By.cssSelector("span:nth-child(1) > span:nth-child(2) > a:nth-child(1)");
    By productOwnerListLocator= By.xpath("//a[@class='merchantStore small']");
    By productNameLocator = By.xpath("//h1[@id='product-name']");
    By goToCartButton = By.xpath("//button[normalize-space()='Sepete git']");


    public void add_product_to_cart() {//İstenilen ürün yeni tab'da açıldığı için driver değiştirildi.2 ürün sepete eklendi.Satıcıların bilgileri alındı.
        switchDriver(1);
        click(addToCartLocator);
        waitForElementsToBeClickable(driver,closePopupLocator,30).click();
        waitForElementsToBeClickable(driver,otherSellerAddToCartLocator,30).click();
        productOwner11= find(productOwner1Locator).getText().toLowerCase(Locale.ENGLISH);
        List<WebElement> allProducts = findAll(productOwnerListLocator);
        productOwner22= allProducts.get(0).getText().toLowerCase(Locale.ENGLISH);
        productName=find(productNameLocator).getText();


    }

    public void go_to_cart() {//Element geç geldiği için statik bekleme yapıldı.
        waitForElementsToBeClickable(driver,goToCartButton,15).click();

    }

}
