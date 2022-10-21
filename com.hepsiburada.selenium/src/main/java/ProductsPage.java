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

        waitForElementsToBeClickable(driver,By.cssSelector("div.moria-ProductCard-bOkJXM"),40);
        Random rnd = new Random();
        List<WebElement> allProducts = findAll(By.cssSelector("div.moria-ProductCard-bOkJXM"));
        System.out.println(allProducts.size());
        int randomProduct = rnd.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
        //a.moria-ProductCard-gyqBb


    }}

