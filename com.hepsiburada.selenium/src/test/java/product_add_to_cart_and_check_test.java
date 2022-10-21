
import org.testng.annotations.Test;

public class product_add_to_cart_and_check_test  extends BaseTest{
    HomePage homePage;
    LoginPage loginPage;

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
    public void UserLogin(){
        loginPage = new LoginPage(driver);
        loginPage.fill_the_email_click_login();
    }


}
