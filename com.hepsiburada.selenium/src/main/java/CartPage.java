import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }


    public int product_count_check() {
        List<WebElement> products = findAll(By.className("basket_item_1rDra"));
        if (products.size() == 2){
            System.out.println("Secilen Urun Sayisi Dogru");
        }
        return products.size();

    }
}
