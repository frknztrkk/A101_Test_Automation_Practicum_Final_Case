import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {
    ProductPage productPage;

    public CartPage(WebDriver driver) {
        super(driver);
    }


    public int product_count_check() {
        List<WebElement> products = findAll(By.className("basket_item_1rDra"));
        if (products.size() == 2){
            System.out.println("Sepetteki Urun Sayisi Dogru.");
        }
        return products.size();

    }

    public boolean is_on_cart_page() {
        if (isDisplayed(By.xpath("//h1[normalize-space()='Sepetim']"))){
            System.out.println("Sepetim Sayfasindasiniz.");
        }
      return  isDisplayed(By.xpath("//h1[normalize-space()='Sepetim']"));
    }
    public String product_owner_name2(){
        productPage= new ProductPage(driver);
        String productOwner2=  find(By.cssSelector("div:nth-child(3) div:nth-child(1) div:nth-child(1) div:nth-child(1) span:nth-child(2) a:nth-child(1)")).getText().toLowerCase();
       if (productOwner2.equals(ProductPage.productOwner22)){
           System.out.println("Ikinci Satici Ismi Dogru.");
       }
        return productOwner2;
    }
    public String product_owner_name1(){
        productPage=new ProductPage(driver);
        String productOwner1= find(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > section:nth-child(1) > section:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(2)>a:nth-child(1)")).getText().toLowerCase();
       if (productOwner1.equals(ProductPage.productOwner11)){
           System.out.println("Birinci Satici Ismi Dogru. ");
       }
        return productOwner1;
       }
}
