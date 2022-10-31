package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Locale;

public class CartPage extends BasePage {
    ProductPage productPage;
    public static String productOwner1;
    public static String productOwner2;
    public static String productName1;
    public static String productName2;
    By productsListLocator = By.className("basket_item_1rDra");
    By cartTextLocator = By.xpath("//h1[normalize-space()='Sepetim']");
    By productOwner1Locator= By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > section:nth-child(1) > section:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(2)>a:nth-child(1)");
    By productOwner2Locator= By.cssSelector("div:nth-child(3) div:nth-child(1) div:nth-child(1) div:nth-child(1) span:nth-child(2) a:nth-child(1)");
    By productsNameList= By.cssSelector("div:nth-child(2)>a:nth-child(1)");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public int product_count_check() {
        List<WebElement> products = findAll(productsListLocator);
        if (products.size() == 2){
            System.out.println("Sepetteki Urun Sayisi Dogru.");
        }
        return products.size();

    }

    public boolean is_on_cart_page() {
        if (isDisplayed(cartTextLocator)){
            System.out.println("Sepetim Sayfasindasiniz.");
        }
      return  isDisplayed(cartTextLocator);
    }
       public void product_check(){
           productPage= new ProductPage(driver);
           productOwner1= find(productOwner1Locator).getText().toLowerCase(Locale.ENGLISH);
           productOwner2= find(productOwner2Locator).getText().toLowerCase(Locale.ENGLISH);
           List<WebElement> productsName= findAll(productsNameList);
           productName1 = productsName.get(0).getText();
           productName2= productsName.get(1).getText();
           if (productOwner1.equals(ProductPage.productOwner11) && productName1.equals(ProductPage.productName) && productOwner2.equals(ProductPage.productOwner22)&&productName2.equals(ProductPage.productName)) {
               System.out.println("Tum Urunler Dogru Eklenmistir. ");
           }
        }



    }
