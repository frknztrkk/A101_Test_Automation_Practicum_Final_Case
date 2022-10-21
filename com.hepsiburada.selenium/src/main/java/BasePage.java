import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement find(By locator){//Find için method atıyoruz.
        return driver.findElement(locator);


}
    public List<WebElement> findAll(By locator) {//findall için method atıyoruz.
        return driver.findElements(locator);
    }

    public void click(By locator){//click için method atıyoruz.

        find(locator).click();
    }
    public void type(By locator,String text){//sendkeys için method atıyoruz.

        find(locator).sendKeys(text);
    }
    public void waitBySeconds(long seconds) {//statik bekleme için method atıyoruz.
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
