import org.testng.Assert;
import org.testng.annotations.Test;

public class without_login_add_to_cart_check_test extends BaseTest{

    HomePage homePage;
    ProductsPage productsPage;
    ProductPage productPage;
    CartPage cartPage;


    @Test(priority = 0)
    public void passTheCookie(){
        homePage = new HomePage(driver);
        homePage.pass_the_cookie();
    }
    @Test(priority = 1)
    public void searchProduct(){
        homePage= new HomePage(driver);
        homePage.search_and_click();
    }
    @Test(priority = 2)
    public void selectProduct(){
        productsPage = new ProductsPage(driver);
        productsPage.get_product();

    }
    @Test(priority = 3)
    public void addProductToCart(){
        productPage=new ProductPage(driver);
        productPage.add_product_to_cart();

    }
    @Test(priority = 4)
    public void goToCart(){
        productPage=new ProductPage(driver);
        productPage.go_to_cart();
    }
    @Test(priority = 5)
    public void productCheck(){
        cartPage=new CartPage(driver);
        Assert.assertEquals(cartPage.product_count_check(),2,"Secilen Urun Sayısı Yanlıs");

    }
}
