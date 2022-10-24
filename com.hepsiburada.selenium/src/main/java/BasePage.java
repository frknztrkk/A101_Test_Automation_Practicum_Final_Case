import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {
     WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator) {//Find için method atıyoruz.
        return driver.findElement(locator);


    }

    public List<WebElement> findAll(By locator) {//findall için method atıyoruz.
        return driver.findElements(locator);
    }

    public void click(By locator) {//click için method atıyoruz.

        find(locator).click();
    }

    public void type(By locator, String text) {//sendkeys için method atıyoruz.

        find(locator).sendKeys(text);
    }

    public void waitBySeconds(long seconds) {//statik bekleme için method atıyoruz.
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement waitForElementsToBeClickable(WebDriver driver,By locator, int second) {//element tıklanabilir olana kadar beklemesi için method atıyoruz.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        return element;
    }
    public void switchDriver(int index){
        List<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(index));
    }
    public WebElement waitForElementsToBeVisible(WebDriver driver,By locator, int second) {//element tıklanabilir olana kadar beklemesi için method atıyoruz.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element;
    }
    public Boolean isDisplayed(By locator){
       return find(locator).isDisplayed();


    }
}