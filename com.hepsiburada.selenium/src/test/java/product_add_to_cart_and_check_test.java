
import org.testng.Assert;
import org.testng.annotations.Test;

public class product_add_to_cart_and_check_test  extends BaseTest{
    HomePage homePage;
    LoginPage loginPage;
    ProductsPage productsPage;
    ProductPage productPage;
    CartPage cartPage;


    @Test
    public void passTheCookie(){
        homePage = new HomePage(driver);
        homePage.pass_the_cookie();
    }

    @Test(dependsOnMethods ="passTheCookie")
    public void redirectToUserLogin(){
        homePage = new HomePage(driver);
        homePage.click_login();
    }

    @Test(dependsOnMethods ="redirectToUserLogin")
    public void UserEmailLogin(){
        loginPage = new LoginPage(driver);
        loginPage.fill_the_email_click_login();
    }

    @Test(dependsOnMethods = "UserEmailLogin")
    public void UserPasswordLogin(){
        loginPage = new LoginPage(driver);
        loginPage.fill_the_password_click_login();

    }
    @Test(dependsOnMethods = "UserPasswordLogin" )
    public void userLoginValidation(){
        homePage = new HomePage(driver);
        Assert.assertEquals(homePage.user_login_validation(),"Hesabım","Hesaba Giris Yapilamadi");
    }
    @Test(dependsOnMethods ="userLoginValidation" )
    public void searchProduct(){
        homePage= new HomePage(driver);
        homePage.search_and_click();
    }
    @Test(dependsOnMethods = "searchProduct")
    public void selectProduct(){
        productsPage = new ProductsPage(driver);
        productsPage.get_product();

    }
    @Test(dependsOnMethods = "selectProduct")
    public void addProductToCart(){
        productPage=new ProductPage(driver);
        productPage.add_product_to_cart();

    }
    @Test(dependsOnMethods ="addProductToCart" )
    public void goToCart(){
        productPage=new ProductPage(driver);
        productPage.go_to_cart();
    }
    @Test(dependsOnMethods = "goToCart")//(dependsOnMethods = {"passTheCookie","searchProduct","selectProduct","addProductToCart","goToCart"})
    public void productCheck(){
        cartPage=new CartPage(driver);
        Assert.assertTrue(cartPage.is_on_cart_page(),"Sepetim Sayfasinda Degilsiniz.");
        Assert.assertEquals(cartPage.product_count_check(),2,"Sepetteki Urun Sayısı Yanlıs.");
        cartPage.product_check();
        Assert.assertEquals(ProductPage.productOwner11, CartPage.productOwner1,"Birinci Satici Ismi Yanlis.");
        Assert.assertEquals(ProductPage.productName, CartPage.productName1,"Birinci Urun Ismi Aynı Degil");
        Assert.assertEquals(ProductPage.productOwner22, CartPage.productOwner2,"Ikinci Satici Ismi Yanlis.");//lowercase yapmazsak
        Assert.assertEquals(ProductPage.productName,CartPage.productName2,"Ikinci Urun Ismi Yanlıs.");
//



    }


}
