package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {
     By productListWaiterLocator=By.cssSelector("ul:nth-child(1)>li:nth-child(1)>div:nth-child(1)>a:nth-child(1)");
     By productListLocator = By.cssSelector("li.productListContent-zAP0Y5msy8OHn5z7T_K_");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void get_product() {

        waitForElementsToBeClickable(driver,productListWaiterLocator,40);
        List<WebElement> allProducts = findAll(productListLocator);
        allProducts.get(3).click();


    }}

