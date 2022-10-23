import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void get_product() {

        waitForElementsToBeClickable(driver,By.cssSelector("ul:nth-child(1)>li:nth-child(1)>div:nth-child(1)>a:nth-child(1)"),40);
        //Random rnd = new Random();
        List<WebElement> allProducts = findAll(By.cssSelector("li.productListContent-zAP0Y5msy8OHn5z7T_K_"));
        //int randomProduct = rnd.nextInt(allProducts.size());
        //allProducts.get(randomProduct).click();
        allProducts.get(0).click();
        //a.moria-ProductCard-gyqBb


    }}

