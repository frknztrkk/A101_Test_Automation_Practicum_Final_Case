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

    public WebElement find(By locator) {//Find için method atandı.
        return driver.findElement(locator);


    }

    public List<WebElement> findAll(By locator) {//findall için method atıyoruz.
        return driver.findElements(locator);
    }// findAll için method atandı.

    public void click(By locator) {//click için method atandı.

        find(locator).click();
    }

    public void type(By locator, String text) {//sendKeys için method atandı.

        find(locator).sendKeys(text);
    }

    public WebElement waitForElementsToBeClickable(WebDriver driver,By locator, int second) {//Element tıklanabilir olana kadar beklemesi için method atandı.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void switchDriver(int index){//Yeni bir sayfaya geçişte driver'ı switch etmek için method atandı.
        List<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(index));
    }
    public Boolean isDisplayed(By locator){//Sayfada element görünür olma kontrolü için method atandı.
       return find(locator).isDisplayed();

        }
    public void hoverOverElement(By locator) {//Element'in üstüne mouse getirmek için method atandı.
        WebElement element = find(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    }


