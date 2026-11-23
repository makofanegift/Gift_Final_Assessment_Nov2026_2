package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class BasePage {

    protected final WebDriver driver;
    protected final WebDriverWait wait;


    protected BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected WebElement waitUntilElementToBeClickable(WebElement element){
        return wait.until(elementToBeClickable(element));
    }
    protected WebElement waitUntilElementIsVisible(WebElement element){
        return wait.until(visibilityOf(element));
    }

    protected void click(WebElement element){
        waitUntilElementToBeClickable(element).click();

    }

    protected void enterText(WebElement element, String text){
        waitUntilElementIsVisible(element).clear();
        waitUntilElementIsVisible(element).sendKeys(text);
    }

    protected void selectFromDropdownByVisibleText(WebElement dropdown, String text){
        new Select(waitUntilElementIsVisible(dropdown)).selectByVisibleText(text);
    }



}
