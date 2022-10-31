package Pages;

import org.openqa.selenium.*;
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

    public WebElement waitForElementsToBeClickable(WebDriver driver,By locator, int second) {//element tıklanabilir olana kadar beklemesi için method atıyoruz.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void switchDriver(int index){
        List<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(index));
    }
    public Boolean isDisplayed(By locator){
       return find(locator).isDisplayed();

        }
    public void hoverOverElement(By locator) {
        WebElement element = find(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

}
